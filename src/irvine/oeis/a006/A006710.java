package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006710.
 * @author Sean A. Irvine
 */
public class A006710 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X5 = RING.monomial(Z.ONE, 5);
  private static final Polynomial<Z> X10 = RING.monomial(Z.ONE, 10);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> e1 = RING.pow(RING.eta(X10, mN), 12, mN);
    final Polynomial<Z> e2 = RING.pow(RING.eta(X2, mN), 4, mN);
    final Polynomial<Z> e3 = RING.pow(RING.eta(X5, mN), 8);
    return RING.coeff(e1, RING.multiply(e2, e3, mN), mN);
  }
}
