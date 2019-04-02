package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000748 Expansion of bracket function.
 * @author Sean A. Irvine
 */
public class A000748 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      mB = Z.THREE.negate();
      return mB;
    }
    final Z t = mA.multiply(-3).subtract(mB.multiply(3));
    mA = mB;
    mB = t;
    return t;
  }
}
