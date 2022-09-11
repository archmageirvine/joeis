package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059060 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059060 extends A059057 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mM > 4 * mN) {
      if (++mN > 0) {
        mT = mT.multiply(24);
      }
      mM = 0;
    }
    return f(mN, 4).coeff(mM).divide(mT);
  }
}
