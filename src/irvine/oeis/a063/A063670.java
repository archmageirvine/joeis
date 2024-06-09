package irvine.oeis.a063;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.oeis.Sequence0;

/**
 * A063670 Positions of nonzero coefficients in cyclotomic polynomial Phi_n(x), converted from binary to decimal.
 * @author Sean A. Irvine
 */
public class A063670 extends Sequence0 {

  private int mN = -1;
  private final CyclotomicPolynomials mCyclotomicPolynomials = new CyclotomicPolynomials();

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    final Polynomial<Z> p = mCyclotomicPolynomials.get(mN);
    Z res = Z.ZERO;
    for (int k = 0; k <= p.degree(); ++k) {
      if (!p.coeff(k).isZero()) {
        res = res.setBit(k);
      }
    }
    return res;
  }
}
