package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006061 Star numbers (A003154) that are squares.
 * @author Sean A. Irvine
 */
public class A006061 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      mB = Z.valueOf(121);
    } else {
      final Z t = mB.multiply(98).subtract(mA).add(24);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

