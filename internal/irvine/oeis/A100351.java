package irvine.oeis;

import irvine.util.array.LongDynamicByteArray;

/**
 * Find terms of A100351 and A097661.
 *
 * @author Sean A. Irvine
 */
public final class A100351 {

  private A100351() { }

  private static final long LIMIT = 10000;
  private static final LongDynamicByteArray SIEVE = new LongDynamicByteArray();

  private static void sieve() {
    long p = 1;
    while (++p < LIMIT) {
      if (SIEVE.get(p) == 0) {
        // i.e. p is prime
        //System.out.println(p);
        long q = p;
        while (true) {
          q += p; // q is current entry
          if (q >= LIMIT) {
            break;
          }
          int c = SIEVE.get(q);
          if (c <= 2) {
            long n = q / p;
            ++c;
            while (n % p == 0) {
              // deal with higher powers
              n = n / p;
              ++c;
            }
            SIEVE.set(q, (byte) c);
          }
        }
      }
    }
  }

  private static boolean test(final long n) {
    long v = 2;
    while (v < n) {
      if (SIEVE.get(n - v) != 2) {
        return false;
      }
      v <<= 1;
    }
    return true;
  }

  /**
   * Verify given numbers.
   *
   * @param args number to test
   */
  public static void main(final String[] args) {
    sieve();
    for (long k = 8; k < LIMIT; ++k) {
      if (test(k)) {
        System.out.println(String.valueOf(k));
      }
    }
  }
}

