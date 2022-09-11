package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059071 Card-matching numbers (Dinner-Diner matching numbers) for 5 kinds of cards.
 * @author Sean A. Irvine
 */
public class A059071 extends A059057 {

  @Override
  public Z next() {
    if (++mM > 5 * mN) {
      ++mN;
      mM = 0;
    }
    return f(5, mN).coeff(mM);
  }
}
