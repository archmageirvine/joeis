package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038694 Smallest odd number with n prime factors all of different number of decimal digits.
 * @author Sean A. Irvine
 */
public class A038694 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mT = null;
  private Z mProd = Z.THREE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
    } else {
      mT = mT.multiply(10);
      mProd = mProd.multiply(mPrime.nextPrime(mT));
    }
    return mProd;
  }
}
