package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072280 Product representation of the Pell numbers A000129 and A002203.
 * @author Sean A. Irvine
 */
public class A072280 extends Sequence1 {

  private static final CR H = CR.SQRT2.add(1);
  private static final CR H2 = H.square();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 2 ? Z.ONE : Z.TWO;
    }
    final Polynomial<Z> cy = CyclotomicPolynomials.cyclotomic(mN);
    CR s = CR.ZERO;
    int k = 0;
    for (final Z c : cy) {
      s = s.add(H2.pow(k).multiply(c));
      ++k;
    }
    return H.subtract(2).pow(cy.degree()).multiply(s).assumeInt().toZ();
  }
}
