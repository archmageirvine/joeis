package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037127 Nextprime(3^n) - 2^n.
 * @author Sean A. Irvine
 */
public class A037127 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
      return Z.ONE;
    }
    mT = mT.multiply(3);
    mA = mA.multiply2();
    return mPrime.nextPrime(mT).subtract(mA);
  }
}
