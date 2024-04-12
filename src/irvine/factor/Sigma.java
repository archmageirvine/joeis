package irvine.factor;

import irvine.util.array.LongDynamicLongArray;

/**
 * Compute the sum of divisors function for small integers.
 * @author Sean A. Irvine
 */
public class Sigma {

  private static final long INITIAL_SIZE = 1024;
  private static final Sigma SINGLETON = new Sigma();

  /**
   * Return the sum of divisors of a positive integer.
   * @param n number
   * @return sum of divisors
   */
  public static long sigma(final long n) {
    return SINGLETON.get(n);
  }

  private final LongDynamicLongArray mSigma = new LongDynamicLongArray();
  private long mMax = 0;

  private long get(final long n) {
    if (n <= 0) {
      throw new IllegalArgumentException();
    }
    if (n >= mMax) {
      final long prev = mMax - 1;
      mMax = mMax == 0 ? INITIAL_SIZE : 2 * mMax;
      for (long k = 1; k < mMax; ++k) {
        for (long j = prev + k - prev % k; j < mMax; j += k) {
          mSigma.add(j, k);
        }
      }
    }
    return mSigma.get(n);
  }
}
