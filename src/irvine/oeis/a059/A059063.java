package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059063 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059063 extends A059057 {

  @Override
  public Z next() {
    if (++mM > 5 * mN) {
      ++mN;
      mM = 0;
    }
    return f(mN, 5).coeff(mM);
  }
}
