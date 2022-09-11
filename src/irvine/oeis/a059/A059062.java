package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059062 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059062 extends A059057 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mM > 5 * mN) {
      if (++mN > 0) {
        mT = mT.multiply(120);
      }
      mM = 0;
    }
    return f(mN, 5).coeff(mM).divide(mT);
  }
}
