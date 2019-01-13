package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001208.
 * @author Sean A. Irvine
 */
public class A001208 implements Sequence {

  // After R. J. Mathar

  private static final int[] A = {0, 3, 8, 15, 26, 35, 52, 69, 89, 112, 146, 172, 212, 259, 302, 354, 418, 476, 548, 633};
  private static final int[] C2 = {3, 3, 5, 5, 7, 6, 8, 8, 10};
  private static final int[][] C3 = {{1, 1}, {1, 1}, {2, 1}, {2, 1}, {3, 1}, {2, 2}, {3, 2}, {3, 2}, {4, 2}};
  private static final int[][] C4 = {{0, 0, 0}, {0, 0, 1}, {1, 0, 1}, {1, 0, 2}, {2, 0, 2}, {2, 1, 2}, {3, 1, 2}, {3, 1, 3}, {4, 1, 3}};

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < A.length) {
      return Z.valueOf(A[mN]);
    }
    final int r = mN % 9;
    final int t = mN / 9;
    final long a2 = 6L * t + C2[r];
    final long a3 = 2L * t + C3[r][0] + (2L * t + C3[r][1]) * a2;
    return Z.valueOf(3L * t + C4[r][2]).multiply(a3).add(4L * t + C4[r][0]).add(Z.valueOf(2L * t + C4[r][1]).multiply(a2));
  }
}
