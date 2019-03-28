package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019581.
 * @author Sean A. Irvine
 */
public class A019581 extends A019575 {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return get(mN, mN, 2).subtract(get(mN, mN, 1)).multiply(mF).toZ();
  }
}
