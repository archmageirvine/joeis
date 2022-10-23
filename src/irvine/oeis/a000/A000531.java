package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000531 From area of cyclic polygon of 2n + 1 sides.
 * @author Sean A. Irvine
 */
public class A000531 extends Sequence1 {

  private long mN = 0;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    ++mN;
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else if (mB == null) {
      mB = Z.SEVEN;
    } else {
      final Z t = mB.multiply(8 * mN - 2).subtract(mA.multiply(16 * mN - 8)).divide(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
