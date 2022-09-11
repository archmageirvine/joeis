package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059061 Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059061 extends A059057 {

  @Override
  public Z next() {
    if (++mM > 4 * mN) {
      ++mN;
      mM = 0;
    }
    return f(mN, 4).coeff(mM);
  }
}
