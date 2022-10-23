package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A006743 Number of convex polygons of length 2n on honeycomb, or EG-convex polyominoes.
 * @author Sean A. Irvine
 */
public class A006743 extends Sequence3 {

  private final Z[] mA = {Z.ONE, Z.ZERO, Z.THREE, Z.TWO, Z.TEN, Z.valueOf(14), Z.valueOf(40), Z.valueOf(74)};
  private int mN = 2;

  @Override
  public Z next() {
    if (++mN < mA.length + 3) {
      return mA[mN - 3];
    }
    System.arraycopy(mA, 1, mA, 0, 7);
    mA[7] = mA[6].multiply(2L * mN - 10)
      .add(mA[5].multiply(7L * mN - 47))
      .add(mA[4].multiply(12L * (7 - mN)))
      .add(mA[3].multiply(4L * (29 - 4L * mN)))
      .add(mA[2].multiply(16L * (mN - 8)))
      .add(mA[1].multiply(16L * (mN - 8)))
      .divide(mN - 5);
    return mA[7];
  }
}

