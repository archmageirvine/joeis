package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059074 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059074 extends A059057 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(24);
    }
    return f(mN, 4).coeff(0).divide(mF);
  }
}
