package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018813.
 * @author Sean A. Irvine
 */
public class A018813 extends A018809 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 6) {
      return Z.valueOf(14);
    }
    return get(mN, 7).subtract(get(mN, 6).multiply2()).add(get(mN, 5)).divide2();
  }
}
