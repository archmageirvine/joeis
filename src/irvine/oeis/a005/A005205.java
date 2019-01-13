package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A005205.
 * @author Sean A. Irvine
 */
public class A005205 extends A000045 {

  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      super.next();
      mB = Z.ONE;
    } else {
      final Z t = mB.multiply(Z.THREE.pow(super.next())).add(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
