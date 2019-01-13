package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001696.
 * @author Sean A. Irvine
 */
public class A001696 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return mA;
    }
    if (mB == null) {
      mB = Z.ONE;
    } else {
      final Z t = mB.add(1).subtract(mA).multiply(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
