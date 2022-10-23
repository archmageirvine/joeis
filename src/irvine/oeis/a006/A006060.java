package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006060 Triangular star numbers.
 * @author Sean A. Irvine
 */
public class A006060 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      mB = Z.valueOf(253);
    } else {
      final Z t = mB.multiply(194).subtract(mA).add(60);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

