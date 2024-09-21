package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072270 A partial product representation of A006131 and A072265.
 * @author Sean A. Irvine
 */
public class A072270 extends Sequence1 {

  private static final CR H = CR.valueOf(17).sqrt().add(1).divide(2);
  private static final CR HH4 = H.square().divide(4);
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    final Polynomial<Z> cy = CyclotomicPolynomials.cyclotomic(mN);
    CR s = CR.ZERO;
    int k = 0;
    for (final Z c : cy) {
      s = s.add(HH4.pow(k).multiply(c));
      ++k;
    }
    return H.subtract(1).pow(cy.degree()).multiply(s).assumeInt().toZ();
  }
}
