package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059068 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059068 extends A059057 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mM > 4 * mN) {
      if (++mN > 1) {
        mF = mF.multiply(Z.valueOf(mN).pow(4));
      }
      mM = 0;
    }
    return f(4, mN).coeff(mM).divide(mF);
  }
}
