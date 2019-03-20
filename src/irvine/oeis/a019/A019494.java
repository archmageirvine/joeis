package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019494.
 * @author Sean A. Irvine
 */
public class A019494 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.FOUR;
        return Z.FOUR;
      }
      mB = Z.TEN;
    } else {
      final Z t = mB.square().add(mA).subtract(1).divide(mA).subtract(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
