package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037132 nextprime(5^n)-nextprime(2^n).
 * @author Sean A. Irvine
 */
public class A037132 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
      return Z.ZERO;
    }
    mT = mT.multiply(5);
    mA = mA.multiply2();
    return mPrime.nextPrime(mT).subtract(mPrime.nextPrime(mA));
  }
}
