package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059073 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059073 extends A059057 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(6);
    }
    return f(mN, 3).coeff(0).divide(mF);
  }
}
