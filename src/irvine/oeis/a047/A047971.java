package irvine.oeis.a047;

import irvine.math.group.IntegerField;
import irvine.math.group.MultivariatePolynomialField;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047971 Triangle of coefficients of Gaussian polynomials [ n+3,3 ].
 * @author Sean A. Irvine
 */
public class A047971 extends Sequence0 {

  private static final MultivariatePolynomialField<Z> RING = new MultivariatePolynomialField<>(IntegerField.SINGLETON, 2);
  private static final MultivariatePolynomial<Z> DEN = RING.multiply(RING.multiply(RING.multiply(q(0), q(1)), q(2)), q(3));
  private int mN = -1;
  private int mM = 0;
  private Polynomial<Z> mG = Polynomial.create(new Z[0]);

  private static MultivariatePolynomial<Z> q(final int n) {
    return RING.subtract(RING.one(), RING.monomial(Z.ONE, new int[] {n, 1}));
  }

  @Override
  public Z next() {
    if (++mM > mG.degree()) {
      ++mN;
      mG = RING.series(RING.one(), DEN, mN, 4 + 2 * mG.degree());
      mM = 0;
    }
    return mG.coeff(mM);
  }
}
