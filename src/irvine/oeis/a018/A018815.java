package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018815 Number of lines through exactly 8 points of <code>an n</code> X n grid of points.
 * @author Sean A. Irvine
 */
public class A018815 extends A018809 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 8) {
      return Z.valueOf(18);
    }
    return get(mN, 9).subtract(get(mN, 8).multiply2()).add(get(mN, 7)).divide2();
  }
}
