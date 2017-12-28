package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApp.class, args);
		System.out.println("====cloud-config 启动完毕====");
	}
/**
 * http://projects.spring.io/spring-cloud/spring-cloud.html
# /{application}/{profile}[/{label}]
# /{application}-{profile}.yml
# /{label}/{application}-{profile}.yml
# /{application}-{profile}.properties
# /{label}/{application}-{profile}.properties
 */
}
