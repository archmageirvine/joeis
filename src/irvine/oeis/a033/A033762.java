package irvine.oeis.a033;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033762 Product t2(q^d); d <code>| 3</code>, where t2 = theta2(q) <code>/ (2 *</code> q^(1/4)).
 * @author Sean A. Irvine
 */
public class A033762 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X3 = RING.monomial(Z.ONE, 3);
  private static final Polynomial<Z> X6 = RING.monomial(Z.ONE, 6);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> a = RING.pow(RING.multiply(RING.eta(X2, mN), RING.eta(X6, mN), mN), 2, mN);
    final Polynomial<Z> b = RING.multiply(RING.eta(RING.x(), mN), RING.eta(X3, mN), mN);
    return RING.coeff(a, b, mN);
  }
}
