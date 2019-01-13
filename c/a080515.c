#include <gmp.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#ifndef boolean
#define boolean int
#define false 0
#define true 1
#endif

const char *TARGET[] = {
  "",
  "2",
  "25",
  "125",
  "1500625",
  "7721159067190625",
  "15177620126188504995068476821390625",
};

boolean testv(long a, int power) {
  mpz_t z;
  mpz_init_set_si(z, a);
  mpz_pow_ui(z, z, power);
  char *s = mpz_get_str(NULL, 10, z);
  const char *t = TARGET[power - 1];
  int tp, sp;
  if (strlen(s) > strlen(t)) {
    for (tp = 0, sp = 0; sp < strlen(s); sp++) {
      if (s[sp] == t[tp]) {
        if (++tp == strlen(t)) {
          mpz_clear(z);
          free(s);
          return true;
        }
      }
    }
  }
  mpz_clear(z);
  free(s);
  return false;
}

void test(long start, long end, int power) {
  long k;
  if (power < 2) {
    printf("Illegal power\n");
    return;
  }
  for (k = start; k < end; k++) {
    if (testv(k, power)) {
      printf("Bingo: %ld\n", k);
      return;
    }
  }
}

int main(int argc, char **args) {
  if (argc < 4) {
    printf("Usage: start end power\n");
  } else {
    test(atol(args[1]), atol(args[2]), atoi(args[3]));
  }
  return 0;
}

