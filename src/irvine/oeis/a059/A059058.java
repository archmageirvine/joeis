package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059058 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059058 extends A059057 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mM > 3 * mN) {
      if (++mN > 0) {
        mT = mT.multiply(6);
      }
      mM = 0;
    }
    return f(mN, 3).coeff(mM).divide(mT);
  }
}
