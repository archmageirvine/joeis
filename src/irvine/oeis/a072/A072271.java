package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072271 A partial product representation of f(n) = A015523(n) and L(n) = A072263(n).
 * @author Sean A. Irvine
 */
public class A072271 extends Sequence1 {

  private static final CR H = CR.valueOf(29).sqrt().add(3).divide(2);
  private static final CR H2 = H.square().divide(5);
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 2 ? Z.ONE : Z.THREE;
    }
    final Polynomial<Z> cy = CyclotomicPolynomials.cyclotomic(mN);
    CR s = CR.ZERO;
    int k = 0;
    for (final Z c : cy) {
      s = s.add(H2.pow(k).multiply(c));
      ++k;
    }
    return H.subtract(3).pow(cy.degree()).multiply(s).assumeInt().toZ();
  }
}
