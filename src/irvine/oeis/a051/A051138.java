package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051138 Divisibility sequence associated with elliptic curve y^2 + y = x^3 - x and point (1, 0).
 * @author Sean A. Irvine
 */
public class A051138 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;

  @Override
  public Z next() {
    if (mD == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      if (mB == null) {
        mB = Z.ONE;
        return Z.ONE;
      }
      if (mC == null) {
        mC = Z.ONE;
        return Z.ONE;
      }
      mD = Z.NEG_ONE;
      return Z.NEG_ONE;
    }
    final Z t = mA.isZero() ? Z.valueOf(-5) : mD.multiply(mB).add(mC.square()).divide(mA);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }
}

