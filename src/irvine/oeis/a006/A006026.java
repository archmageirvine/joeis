package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006026 Number of column-convex polyominoes with perimeter n.
 * @author Sean A. Irvine
 */
public class A006026 implements Sequence {

  private long mN = 1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.THREE;

  @Override
  public Z next() {
    if (++mN <= 3) {
      if (mN < 3) {
        return Z.ONE;
      }
    } else {
      final Z t = mC.multiply(21 * mN - 34).multiply(mN - 1).multiply2()
        .subtract(mB.multiply(23 * mN - 43).multiply(3 * mN - 8))
        .add(mA.multiply(2 * mN - 7).multiply(mN - 3).multiply(16))
        .divide(mN).divide(mN - 1).divide(5);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}

