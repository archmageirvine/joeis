package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065843 Let u be any string of n digits from {0,1}; let f(u) = number of distinct primes, not beginning with 0, formed by permuting the digits of u; then a(n) = max_u f(u).
 * @author Sean A. Irvine
 */
public class A065843 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final long[] cnts = new long[mN + 1];
    final long lim = 1L << mN;
    for (long p = 1L << (mN - 1); p < lim; p = mPrime.nextPrime(p)) {
      ++cnts[Long.bitCount(p)];
    }
    return Z.valueOf(LongUtils.max(cnts));
  }
}

