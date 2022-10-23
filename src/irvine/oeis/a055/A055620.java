package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055620 Digits of an idempotent 6-adic number.
 * @author Sean A. Irvine
 */
public class A055620 extends Sequence0 {

  private Z mA = Z.FOUR;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    final Z t = mT;
    mT = mT.multiply(6);
    mA = mA.modPow(Z.THREE, mT);
    return mA.divide(t);
  }
}
