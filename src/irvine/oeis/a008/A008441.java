package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008441 Number of ways of writing n as the sum of 2 triangular numbers.
 * @author Sean A. Irvine
 */
public class A008441 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> a = RING.pow(RING.eta(X2, mN), 4, mN);
    final Polynomial<Z> b = RING.eta(RING.x(), mN);
    final Polynomial<Z> c = RING.multiply(b, b, mN);
    return RING.coeff(a, c, mN);
  }
}
