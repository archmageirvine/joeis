#include <gmp.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char buf[1024];
char buf2[1024];

/*
boolean testv(long a, int power) {
  mpz_t z;
  mpz_init_set_si(z, a);
  mpz_pow_ui(z, z, power);
  char *s = mpz_get_str(buf, 10, z);
  int slen = strlen(s);
  int tp, sp;
  const char *t;
  int tlen;
  t = TARGET[0];
  tlen = strlen(t);
  for (tp = 0, sp = 0; sp < slen; sp++) {
    if (s[sp] == t[tp]) {
      if (++tp == tlen) {
        printf("Bingo: A080808 %ld\n", a);
      }
    }
  }
  t = TARGET[1];
  tlen = strlen(t);
  for (tp = 0, sp = 0; sp < slen; sp++) {
    if (s[sp] == t[tp]) {
      if (++tp == tlen) {
        printf("Bingo: A080809 %ld\n", a);
      }
    }
  }
  t = TARGET[2];
  tlen = strlen(t);
  for (tp = 0, sp = 0; sp < slen; sp++) {
    if (s[sp] == t[tp]) {
      if (++tp == tlen) {
        printf("Bingo: A080812 %ld\n", a);
      }
    }
  }
  t = TARGET[3];
  tlen = strlen(t);
  for (tp = 0, sp = 0; sp < slen; sp++) {
    if (s[sp] == t[tp]) {
      if (++tp == tlen) {
        printf("Bingo: A080815 %ld\n", a);
      }
    }
  }
  mpz_clear(z);
  return false;
}
*/

void test(unsigned int target) {
  mpz_t n, s, u;
  if (target < 1) {
    printf("Illegal target\n");
    return;
  }
  mpz_init(n);
  mpz_init(u);
  mpz_init_set_si(s, 10);
  mpz_pow_ui(s, s, target - 1);
  mpz_sqrt(n, s);
  char *t = mpz_get_str(buf, 10, n);
  printf("Starting point: %s\n", t);
  mpz_mul(s, n, n);

  int solved = 0;
  int done[10];
  int count[10];
  int k;
  for (k = 0; k < 10; k++) {
    done[k] = 0;
  }
  while (solved != 10) {
    for (k = 0; k < 10; k++) {
      count[k] = 0;
    }
    char *t = mpz_get_str(buf, 10, s);
    while (*t) {
      count[*t++ - '0']++;
    }
    for (k = 0; k < 10; k++) {
      if (count[k] == target && done[k] == 0) {
        mpz_sqrt(u, s);
        printf("A0%d = %s %s\n", 48345 + k, mpz_get_str(buf2, 10, u), mpz_get_str(buf, 10, s));
        fflush(stdout);
        done[k] = 1;
        solved++;
      }
    }
    mpz_add_ui(n, n, 1);
    mpz_add(u, n, n);
    mpz_sub_ui(u, u, 1);
    mpz_add(s, s, u);
  }
  mpz_clear(s);
  mpz_clear(n);
  mpz_clear(u);
}

int main(int argc, char **args) {
  if (argc < 1) {
    printf("Usage: n\n");
  } else {
    test(atoi(args[1]));
  }
  return 0;
}

