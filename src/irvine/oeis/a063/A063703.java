package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.oeis.Sequence0;

/**
 * A063703 Cyclotomic polynomials Phi_n at x=phi, floored down (where phi = tau = (sqrt(5)+1)/2).
 * @author Sean A. Irvine
 */
public class A063703 extends Sequence0 {

  private int mN = -1;
  private final CyclotomicPolynomials mCyclotomicPolynomials = new CyclotomicPolynomials();

  protected Z select(final CR n) {
    return n.floor();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return select(CR.PHI);
    }
    final Polynomial<Z> p = mCyclotomicPolynomials.get(mN);
    CR sum = CR.ZERO;
    CR pk = CR.ONE;
    for (int k = 0; k <= p.degree(); ++k) {
      if (!p.coeff(k).isZero()) {
        sum = sum.add(pk.multiply(p.coeff(k)));
      }
      pk = pk.multiply(CR.PHI);
    }
    return select(sum);
  }
}
