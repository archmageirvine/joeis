package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007773 For any circular arrangement of 0..n-1, let S = sum of squares of every sum of two contiguous numbers; then a(n) = # of distinct values of S.
 * @author Sean A. Irvine
 */
public class A007773 extends Sequence1 {

  private static final long[] SMALL = {0, 1, 1, 1, 3, 8, 21};
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[(int) mN]);
    }
    return Z.valueOf(mN).square().subtract(16).multiply(mN).add((mN & 1) == 0 ? 30 : 27).divide(6);
  }
}
