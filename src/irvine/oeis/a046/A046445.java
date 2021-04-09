package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046445 Smallest composite with n prime factors that are distinct in length.
 * @author Sean A. Irvine
 */
public class A046445 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(10);
    mA = mA.multiply(mPrime.nextPrime(mT));
    return mA.equals(Z.TWO) ? Z.ONE : mA;
  }
}
