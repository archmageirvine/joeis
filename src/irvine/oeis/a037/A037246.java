package irvine.oeis.a037;

import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a005.A005202;

/**
 * A005202.
 * @author Sean A. Irvine
 */
public class A037246 extends A005202 {

  private static final MultivariatePolynomial<Z> XYP1 = RING.add(RING.one(), XY);
  private static final MultivariatePolynomial<Z> XYS1 = RING.subtract(RING.one(), XY);
  private static final MultivariatePolynomial<Z> XYM1 = RING.subtract(XY, RING.one());
  private static final int[] P1 = {2, 0};
  private static final int[] P2 = {2, 2};
  private int mN = 0;

  @Override
  public Z next() {
    step(++mN);
    final int[] limits = {mN, mN};
    final MultivariatePolynomial<Z> h0 = RING.subtract(RING.multiply(mH.substitutePowers(P2, limits), XYM1, limits),
      RING.multiply(RING.pow(mH, 2, limits), XYP1, limits));
    final MultivariatePolynomial<Z> h = RING.add(RING.add(RING.multiply(XYP1, mH, limits),
      RING.multiply(XYS1, mH.substitutePowers(P1, limits), limits)),
      RING.divide(h0, Z.TWO));
    Z sum = Z.ZERO;
    final Polynomial<Z> row = h.extract(0, mN).toPolynomial();
    for (int j = 1; j <= mN; ++j) {
      sum = sum.add(row.coeff(j).multiply(j));
    }
    return sum;
  }
}

