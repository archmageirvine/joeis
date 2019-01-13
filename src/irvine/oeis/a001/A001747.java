package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001747.
 * @author Sean A. Irvine
 */
public class A001747 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    if (mN.equals(Z.ZERO)) {
      mN = Z.ONE;
      return Z.TWO;
    }
    mN = mPrime.nextPrime(mN);
    return mN.multiply2();
  }
}
