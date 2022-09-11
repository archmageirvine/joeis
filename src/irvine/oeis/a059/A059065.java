package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059065 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059065 extends A059057 {

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return f(2, mN).coeff(mM);
  }
}
