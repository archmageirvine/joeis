package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001354 Coordination sequence for hyperbolic tessellation 3^7 (from triangle group (2,3,7)).
 * @author Sean A. Irvine
 */
public class A001354 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null && mB == null) {
      mB = Z.ONE;
      return Z.ONE;
    }
    if (mA == null) {
      mB = null;
      mA = Z.SEVEN;
      return mA;
    }
    if (mB == null) {
      mB = Z.valueOf(21);
      return mB;
    }
    final Z t = mB.multiply(3).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
