package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060380 Let f(m) = smallest prime that divides k^2 + k + m for k = 0,1,2,...; sequence gives smallest m &gt;= 2 such that f(m) is the n-th prime, or -1 if no such m exists.
 * @author Sean A. Irvine
 */
public class A060380 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  private boolean is(final long d) {
    long p = 3;
    final long u = 1 - 4 * d;
    for (int k = 2; k <= mN; ++k, p = mPrime.nextPrime(p)) {
      if (LongUtils.jacobi(u, p) != -1) {
        return false;
      }
    }
    return LongUtils.jacobi(u, p) != -1;
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.TWO : Z.THREE;
    }
    long d = 1;
    while (true) {
      d += 2;
      if (is(d)) {
        return Z.valueOf(d);
      }
    }
  }
}

