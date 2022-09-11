package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059059 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059059 extends A059057 {

  @Override
  public Z next() {
    if (++mM > 3 * mN) {
      ++mN;
      mM = 0;
    }
    return f(mN, 3).coeff(mM);
  }
}
