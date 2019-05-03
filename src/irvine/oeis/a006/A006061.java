package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006061 Star numbers <code>(A003154)</code> that are squares.
 * @author Sean A. Irvine
 */
public class A006061 implements Sequence {

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

