package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018838 Number of steps for knight to reach (n,n) on infinite chessboard.
 * @author Sean A. Irvine
 */
public class A018838 implements Sequence {

  private static final int[] SMALL_CASES = {0, 2, 4};
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < SMALL_CASES.length ? Z.valueOf(SMALL_CASES[(int) mN]) : Z.valueOf(2 * ((mN + 2) / 3));
  }
}
