package irvine.math;

import irvine.factor.prime.Fast;
import irvine.util.array.LongDynamicLongArray;

/**
 * The Euler totient function computed by a sieve. This is particularly efficient
 * if lots of small totient values need to be calculated.
 * @author Sean A. Irvine
 */
public final class EulerTotientSieve {

  private static EulerTotientSieve sSingleton = new EulerTotientSieve(100000);

  /**
   * Return Euler phi function of a positive long.
   * @param n parameter
   * @return <code>phi(n)</code>
   * @throws IllegalArgumentException if <code>n</code> is less than 1.
   */
  public static long phi(final long n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    if (n > sSingleton.mMax) {
      sSingleton = new EulerTotientSieve(2 * n);
    }
    return sSingleton.phiLookup(n);
  }

  private final long mMax;
  private final LongDynamicLongArray mPhi = new LongDynamicLongArray();

  private EulerTotientSieve(final long max) {
    mMax = max;
    for (long k = 1; k <= mMax; ++k) {
      mPhi.set(k, 1L);
    }
    final Fast prime = new Fast();
    for (long p = 2; p <= mMax; p = prime.nextPrime(p)) {
      final long p1 = p - 1;
      sieve(p, p1);
      for (long q = p * p; q <= mMax; q *= p) {
        sieve(q, p);
      }
    }
  }

  private void sieve(final long p, final long p1) {
    for (long q = p; q <= mMax; q += p) {
      mPhi.set(q, mPhi.get(q) * p1);
    }
  }

  private long phiLookup(final long n) {
    assert n <= mMax;
    return mPhi.get(n);
  }
}


