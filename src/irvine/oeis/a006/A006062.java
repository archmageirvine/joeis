package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006062 Star-hex numbers.
 * @author Sean A. Irvine
 */
public class A006062 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      mB = Z.valueOf(37);
    } else {
      final Z t = mB.multiply(34).subtract(mA).add(4);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

