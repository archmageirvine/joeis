package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394445 a(n) is the minimum k such that every 2-coloring of {1, ..., k} contains a monochromatic solution to x + y = n*z with x, y, z pairwise distinct.
 * @author Sean A. Irvine
 */
public class A394445 extends Sequence1 {

  private static final long[] SMALL = {9, 9, 15, 20, 25, 31, 49};
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= SMALL.length) {
      return Z.valueOf(SMALL[(int) (mN - 1)]);
    }
    return (mN & 1) == 1 ? Z.valueOf(mN).multiply(mN + 3).divide2() : Z.valueOf(mN).square().add(2 * mN + 2).divide2();
  }
}
