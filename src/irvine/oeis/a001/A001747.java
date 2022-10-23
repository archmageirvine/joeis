package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001747 2 together with primes multiplied by 2.
 * @author Sean A. Irvine
 */
public class A001747 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    if (mN.isZero()) {
      mN = Z.ONE;
      return Z.TWO;
    }
    mN = mPrime.nextPrime(mN);
    return mN.multiply2();
  }
}
