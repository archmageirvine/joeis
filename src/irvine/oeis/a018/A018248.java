package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018248 The 10-adic integer x = ...1787109376 satisfies x^2 = x.
 * @author Sean A. Irvine
 */
public class A018248 extends Sequence0 {

  private Z mA = Z.SIX;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    final Z t = mT;
    mT = mT.multiply(10);
    mA = mA.modPow(Z.FIVE, mT);
    return mA.divide(t);
  }
}
