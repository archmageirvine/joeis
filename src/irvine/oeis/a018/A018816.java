package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018816 Number of lines through exactly 9 points of <code>an n</code> X n grid of points.
 * @author Sean A. Irvine
 */
public class A018816 extends A018809 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 9) {
      return Z.valueOf(20);
    }
    return get(mN, 10).subtract(get(mN, 9).multiply2()).add(get(mN, 8)).divide2();
  }
}
