package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004531 Number of integer solutions to <code>x^2 + 4 *</code> y^2 <code>= n</code>.
 * @author Sean A. Irvine
 */
public class A004531 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> Q2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> Q4 = RING.monomial(Z.ONE, 4);
  private static final Polynomial<Z> Q8 = RING.monomial(Z.ONE, 8);
  private static final Polynomial<Z> Q16 = RING.monomial(Z.ONE, 16);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> e1 = RING.eta(RING.x(), mN);
    final Polynomial<Z> e2 = RING.eta(Q2, mN);
    final Polynomial<Z> e4 = RING.eta(Q4, mN);
    final Polynomial<Z> e8 = RING.eta(Q8, mN);
    final Polynomial<Z> e16 = RING.eta(Q16, mN);
    final Polynomial<Z> num = RING.pow(RING.multiply(e2, e8, mN), 5, mN);
    final Polynomial<Z> den = RING.multiply(RING.pow(e1, 2, mN), RING.multiply(RING.pow(e4, 4, mN), RING.pow(e16, 2, mN), mN), mN);
    return RING.coeff(num, den, mN);
  }
}
