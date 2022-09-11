package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059070 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059070 extends A059057 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mM > 5 * mN) {
      if (++mN > 1) {
        mF = mF.multiply(Z.valueOf(mN).pow(5));
      }
      mM = 0;
    }
    return f(5, mN).coeff(mM).divide(mF);
  }
}
