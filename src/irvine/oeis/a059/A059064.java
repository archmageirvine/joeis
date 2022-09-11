package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059064 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059064 extends A059057 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      if (++mN > 1) {
        mF = mF.multiply(mN).multiply(mN);
      }
      mM = 0;
    }
    return f(2, mN).coeff(mM).divide(mF);
  }
}
