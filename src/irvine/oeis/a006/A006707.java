package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006707.
 * @author Sean A. Irvine
 */
public class A006707 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X3 = RING.monomial(Z.ONE, 3);
  private static final Polynomial<Z> X6 = RING.monomial(Z.ONE, 6);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> e1 = RING.pow(RING.eta(X2, mN), 11, mN);
    final Polynomial<Z> e2 = RING.pow(RING.eta(X3, mN), 13, mN);
    final Polynomial<Z> e3 = RING.pow(RING.eta(RING.x(), mN), 7);
    final Polynomial<Z> e4 = RING.pow(RING.eta(X6, mN), 17);
    return RING.coeff(RING.multiply(e1, e2, mN), RING.multiply(e3, e4), mN);
  }
}
