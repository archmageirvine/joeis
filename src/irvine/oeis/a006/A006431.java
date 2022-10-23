package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006431 Numbers that have a unique partition into a sum of four nonnegative squares.
 * @author Sean A. Irvine
 */
public class A006431 extends Sequence1 {

  private static final int[] INITIAL = {0, 0, 1, 2, 3, 5, 6, 7, 8, 11, 14, 15, 23, 24, 32};
  private static final Z TWELVE = Z.valueOf(12);
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < INITIAL.length) {
      return Z.valueOf(INITIAL[mN]);
    }
    switch (mN % 3) {
      case 0:
        return Z.SEVEN.shiftLeft(mN / 3 * 2 - 7);
      case 1:
        return TWELVE.shiftLeft(mN / 3 * 2 - 7);
      default:
        return Z.ONE.shiftLeft(mN / 3 * 2 - 3);
    }
  }
}
