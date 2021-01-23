package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018817 Number of lines through exactly 10 points of an n X n grid of points.
 * @author Sean A. Irvine
 */
public class A018817 extends A018809 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 10) {
      return Z.valueOf(22);
    }
    return get(mN, 11).subtract(get(mN, 10).multiply2()).add(get(mN, 9)).divide2();
  }
}
