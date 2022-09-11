package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059067 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059067 extends A059057 {

  @Override
  public Z next() {
    if (++mM > 3 * mN) {
      ++mN;
      mM = 0;
    }
    return f(3, mN).coeff(mM);
  }
}
