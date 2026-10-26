package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046445 Smallest number with n prime factors that are distinct in length, where length is the number of decimal digits.
 * @author Sean A. Irvine
 */
public class A046445 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mT = null;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    mT = mT == null ? Z.ONE : mT.multiply(10);
    mA = mA.multiply(mPrime.nextPrime(mT));
    return mA;
  }
}
