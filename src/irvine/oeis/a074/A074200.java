package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074200 a(n) = m, the smallest number such that (m+k)/k is prime for k=1, 2, ..., n.
 * @author Sean A. Irvine
 */
public class A074200 extends Sequence1 {

  // After Chai Wah Wu

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mLcm = Z.ONE;

  private boolean is(final Z m) {
    for (long k = mN; k > 0; --k) {
      if (!mPrime.isPrime(m.divide(k).add(1))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mLcm = mLcm.lcm(++mN);
    Z m = mLcm;
    while (!is(m)) {
      m = m.add(mLcm);
    }
    return m;
  }
}
