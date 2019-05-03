package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018812 Number of lines through exactly 5 points of an <code>n X n</code> grid of points.
 * @author Sean A. Irvine
 */
public class A018812 extends A018809 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 5) {
      return Z.valueOf(12);
    }
    return get(mN, 6).subtract(get(mN, 5).multiply2()).add(get(mN, 4)).divide2();
  }
}
