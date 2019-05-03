package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018814 Number of lines through exactly 7 points of an <code>n X n</code> grid of points.
 * @author Sean A. Irvine
 */
public class A018814 extends A018809 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 7) {
      return Z.valueOf(16);
    }
    return get(mN, 8).subtract(get(mN, 7).multiply2()).add(get(mN, 6)).divide2();
  }
}
