/**
 * A248037.
 *
 * Compile with:
 *    gcc -Wall -O9 -o a248037 a248037.c -lgmp
 *
 * This program was used in the confirmation of a(15)=3743559068799. It
 * essentially performs an exhaustive search with some additional smarts
 * to avoid evaluating useless candidates.  There are C, Java, and Python
 * versions of this code that are roughly equivalent.
 *
 * We precompute the exact count of triples and halvings for all values less
 * than PRECOMPUTE.  During the actual search we can then truncate the
 * calculation whenever we reach a value less than PRECOMPUTE and simply add
 * the cached counts to the current values.  This saves computing all the
 * way to 1 for every number.
 * 
 * If during the Collatz calculation for n we arrive at some number m,
 * smaller than n and the ratio triples/halves is less than the current
 * best, then the number n can be discarded.
 *
 * For sufficiently large n, n can only be a member of the sequence if
 * n = 7, 15, 27, or 31 (mod 32).  This is because all other values provably
 * have a ratio triples/havings of less than 0.6.
 *
 * Most values of n less than, say, about 2^50, can be calculated using
 * 63 or 64-bit arithmetic.  We detect when this is not the case by
 * checking if overflow will occur on a tripling step.  When such an
 * overflow is detected, the entire calculation for that number is redone
 * using big number arithmetic.
 *
 * @author Sean A. Irvine
 * @author David Consiglio, Jr.
 */
#include <stdio.h>
#include <stdlib.h>
#include <inttypes.h>
#include <limits.h>
#include <gmp.h>
#include <time.h>

// Cache of initial terms (for efficiency only)
const int64_t MAX_INTERMEDIATE = (INT64_MAX - 1) / 3;
const int PRECOMPUTE = 10000000; // < 2^31
mpz_t Z_PRECOMPUTE;
int *cacheHalves;
int *cacheTriples;

// Tracks the best ratio
int64_t bestTriples = -1;
int64_t bestHalves = 1;

// Used for statistics and progress reporting
const char* PROGRESS_FORMAT = "%s Tested: %" PRId64 " (%" PRId64 " extended)\n";
char timeBuffer[27];
int64_t tested = 0;
int64_t extended = 0;

// Workspace for extended precision calculation
mpz_t m;

// Number currently being checked
int64_t candidate = 0;

char *now() {
  time_t timer;
  struct tm* tm_info;
  time(&timer);
  tm_info = localtime(&timer);
  strftime(timeBuffer, 27, "%Y-%m-%d %H:%M:%S ", tm_info);
  return timeBuffer;
}

void collatzRatioPrecompute(int n) {
  // Limit on pre-computation is low enough that this will never overflow
  int halves = 0;
  int triples = 0;
  int64_t m = n;
  while (m > 1) {
    if ((m & 1) == 1) {
      m = 3 * m + 1;
      triples++;
    }
    do {
      m >>= 1;
      halves++;
    } while ((m & 1) == 0);
  }
  cacheHalves[n] = halves;
  cacheTriples[n] = triples;
}

int collatzRatio(int64_t n) {
  int halves = 0;
  int triples = 0;
  int64_t halvesScaled = 0;
  int64_t triplesScaled = 0;
  int64_t m = n;
  while (m >= PRECOMPUTE) {
    if (m < n && triplesScaled < halvesScaled) {
      return 0;
    }
    if ((m & 1) == 1) {
      if (m > MAX_INTERMEDIATE) {
        return -1; // overflow
      }
      m = 3LL * m + 1;
      triples++;
      triplesScaled += bestHalves;
    }
    do {
      m >>= 1;
      halves++;
      halvesScaled += bestTriples;
    } while ((m & 1) == 0);
  }
  // m < PRECOMPUTE < 2^31, hence cast to int is safe
  triples += cacheTriples[(int) m];
  halves += cacheHalves[(int) m];
  // Following multiplies are extremely unlikely to overflow since overflow
  // would require having O(2^32) halvings or triples.  Since current terms
  // are in the hundreds, this will not happen any time soon.
  if (triples * bestHalves > halves * bestTriples) {
    bestTriples = triples;
    bestHalves = halves;
    return 1;
  }
  return 0;
}

int collatzRatioGmp(mpz_t n) {
  int64_t halves = 0;
  int64_t triples = 0;
  int64_t triplesScaled = 0;
  int64_t halvesScaled = 0;
  mpz_set(m, n);
  while (mpz_cmp(m, Z_PRECOMPUTE) >= 0) {
    if (mpz_cmp(m, n) < 0 && triplesScaled < halvesScaled) {
      return 0;
    }
    if (mpz_odd_p(m)) {
      mpz_mul_ui(m, m, 3);
      mpz_add_ui(m, m, 1);
      triples++;
      triplesScaled += bestHalves;
    }
    // We know m must be even at this point, but we want to remove every
    // power of 2.  So count the trailing 0 bits, then shift it down.
    int b = mpz_scan1(m, 1);
    mpz_tdiv_q_2exp(m, m, b);
    halves += b;
    halvesScaled += b * bestTriples;
  }
  // m is less than PRECOMPUTE < 2^31, hence cast to int is safe
  int u = (int) mpz_get_ui(m);
  triples += cacheTriples[u];
  halves += cacheHalves[u];
  if (triples * bestHalves > halves * bestTriples) {
    bestTriples = triples;
    bestHalves = halves;
    return 1;
  }
  return 0;
}

void printBest() {
  double ratio = bestTriples / (double) bestHalves;
  printf("%s Ratio: %" PRId64 "/%" PRId64 " = %.12g\n", now(), bestTriples, bestHalves, ratio);
  fflush(stdout);
}

int64_t next(int64_t end) {
  if (candidate < 1) {
    candidate = 1;
    return 2;
  }
  // Early terms do not all obey provable residue classes for later terms, so
  // (if required) do all these small cases in a separate loop
  int64_t limit1 = end < 8400511 ? end : 8400511;
  while (candidate <= limit1) {
    candidate += 2;
    int res = collatzRatio(candidate);
    if (res > 0) {
      printBest();
      return candidate;
    } else if (res < 0) {
      printf("Something really bad happened, should be impossible\n");
      exit(1);
    }
  }
  // Main loop for searching over candidates, candidate is already odd.
  mpz_t n;
  mpz_init(n);
  int64_t r = candidate & 7;
  if (r == 1 || r == 5) {
    candidate -= 2;
  }
  // Candidate is now 3 or 7 (mod 8), means we can increment by 4 each loop
  while (candidate < end) {
    candidate += 4;
    int64_t r = candidate & 31;
    if (r == 7 || r == 15 || r == 27 || r == 31) {
      int test = collatzRatio(candidate);
      if (test < 0) {
        // Overflow detected in calculation, switch to arbitrary precision
        mpz_set_ui(n, candidate);
        test = collatzRatioGmp(n);
        extended++;
      }
      if (test) {
        printBest();
        mpz_clear(n);
        return candidate;
      }
      if (++tested >= 1000000000L) {
        printf(PROGRESS_FORMAT, now(), candidate, extended);
        fflush(stdout);
        tested = 0;
        extended = 0;
      }
    }
  }
  printf(PROGRESS_FORMAT, now(), candidate, extended);
  return 0;
}

/**
 * Search a specific range.
 */
int main(int argc, char **args) {
  if (sizeof(int64_t) != 8) {
    printf("Expected a machine where int64_t was 64-bits!\n");
    return 1;
  }
  if (argc < 5) {
    printf("Usage: a248037 start end triples havles\n");
    return 1;
  }
  // Prepare a cache of the halvings and triples for all small terms
  mpz_init_set_ui(Z_PRECOMPUTE, PRECOMPUTE);
  cacheHalves = malloc(sizeof(int) * PRECOMPUTE);
  cacheTriples = malloc(sizeof(int) * PRECOMPUTE);
  int k;
  for (k = 1; k < PRECOMPUTE; k++) {
    collatzRatioPrecompute(k);
  }
  // Prepare workspace for extended precision calculations
  mpz_init(m);
  // Perform the search over the requested range
  // Make the start an odd number, because we only need consider odd numbers
  candidate = (atoll(args[1]) | 1) - 2;
  int64_t end = atoll(args[2]);
  bestTriples = atoll(args[3]);
  bestHalves = atoll(args[4]);
  printf("%" PRId64 " %" PRId64 " %" PRId64 "/%" PRId64 "\n", candidate, end, bestTriples, bestHalves);
  int64_t t;
  while ((t = next(end)) > 0) {
    printf("%" PRId64 "\n", t);
  }
  return 0;
}
