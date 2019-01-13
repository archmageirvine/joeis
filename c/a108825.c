#include <gmp.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Approx 1GB table of precomputed digit sums
#define CHUNK  100000000
char DIGIT_SUM[CHUNK];

void initTable() {
  int k;
  DIGIT_SUM[0] = 0;
  for (k = 0; k < CHUNK; k++) {
    DIGIT_SUM[k] = (char) ((k % 10) + DIGIT_SUM[k / 10]);
  }
}

long digitSum(mpz_t m) {
  mpz_t n;
  mpz_init_set(n, m);
  long c = 0;
  while (mpz_sgn(n) != 0) {
    c += (int) DIGIT_SUM[mpz_tdiv_q_ui(n, n, CHUNK)];
  }
  mpz_clear(n);
  return c;
}


int main(int argc, char **args) {
  initTable();
  long mN = 0;
  mpz_t mF;
  mpz_init_set_si(mF, 1);
  while (1) {
    long n = ++mN;
    // Some trickery to remove multiples of 10 (i.e. 0's) in the factorial.
    while (n % 10 == 0) {
      n /= 10;
    }
    while (n % 5 == 0) {
      n /= 5;
      mpz_tdiv_q_2exp(mF, mF, 1);
    }
    mpz_mul_ui(mF, mF, n);
    if (digitSum(mF) % mN == 0) {
      printf("%ld\n", mN);
      fflush(stdout);
    }
  }
}
