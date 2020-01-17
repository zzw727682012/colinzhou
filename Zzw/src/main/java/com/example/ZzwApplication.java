package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example")
@EnableJpaRepositories(basePackages = "com.example")
public class ZzwApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZzwApplication.class, args);
	}
}
