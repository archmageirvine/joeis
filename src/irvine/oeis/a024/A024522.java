package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A024522 a(n) = 2nd elementary symmetric function of {1, p(1), p(2), ..., p(n-1)}, where p(0) = 1.
 * @author Sean A. Irvine
 */
public class A024522 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private long mR = 1;

  @Override
  public Z next() {
    mR = mPrime.nextPrime(mR);
    final Z r = Z.valueOf(mR);
    for (long p = 1; p < mR; p = mPrime.nextPrime(p)) {
      mSum = mSum.add(r.multiply(p));
    }
    return mSum;
  }
}
