package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054869 Digits of an idempotent 6-adic number.
 * @author Sean A. Irvine
 */
public class A054869 implements Sequence {

  private Z mA = Z.THREE;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    final Z t = mT;
    mT = mT.multiply(6);
    mA = mA.modPow(Z.TWO, mT);
    return mA.divide(t);
  }
}
