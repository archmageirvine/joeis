package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018837 Number of steps for knight to reach (n,0) on infinite chessboard.
 * @author Sean A. Irvine
 */
public class A018837 extends Sequence0 {

  private static final int[] SMALL_CASES = {0, 3, 2, 3, 2, 3, 4, 5};
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < SMALL_CASES.length
      ? Z.valueOf(SMALL_CASES[(int) mN])
      : Z.valueOf((mN & 1) == 0 ? 2 * ((mN + 2) / 4) : 2 * ((mN + 1) / 4) + 1);
  }
}
