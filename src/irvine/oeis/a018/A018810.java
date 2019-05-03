package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018810 Number of lines through exactly 3 points of an <code>n X n</code> grid of points.
 * @author Sean A. Irvine
 */
public class A018810 extends A018809 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.EIGHT;
    }
    return get(mN, 4).subtract(get(mN, 3).multiply2()).add(get(mN, 2)).divide2();
  }
}
