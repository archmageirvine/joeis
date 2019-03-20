package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019489.
 * @author Sean A. Irvine
 */
public class A019489 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.THREE;
        return Z.THREE;
      }
      mB = Z.SEVEN;
    } else {
      final Z t = mB.square().add(mA).subtract(1).divide(mA).subtract(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
