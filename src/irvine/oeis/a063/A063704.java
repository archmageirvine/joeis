package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.oeis.Sequence0;

/**
 * A063704 Cyclotomic polynomials Phi_n at x=phi divided by sqrt(5) and floored down (where phi = tau = (sqrt(5)+1)/2).
 * @author Sean A. Irvine
 */
public class A063704 extends Sequence0 {

  private static final CR SQRT5 = CR.FIVE.sqrt();
  private int mN = -1;
  private final CyclotomicPolynomials mCyclotomicPolynomials = new CyclotomicPolynomials();

  protected Z select(final CR n) {
    return n.floor();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return select(CR.PHI.divide(SQRT5));
    }
    final Polynomial<Z> p = mCyclotomicPolynomials.get(mN);
    CR res = CR.ZERO;
    CR pk = CR.ONE;
    for (int k = 0; k <= p.degree(); ++k) {
      if (!p.coeff(k).isZero()) {
        res = res.add(pk.multiply(p.coeff(k)));
      }
      pk = pk.multiply(CR.PHI);
    }
    return select(res.divide(SQRT5));
  }
}
