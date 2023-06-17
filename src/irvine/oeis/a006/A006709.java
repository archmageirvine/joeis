package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006709 Expansion of a modular function.
 * @author Sean A. Irvine
 */
public class A006709 extends AbstractSequence {

  /** Construct the sequence. */
  public A006709() {
    super(-2);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X3 = RING.monomial(Z.ONE, 3);
  private static final Polynomial<Z> X6 = RING.monomial(Z.ONE, 6);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> e1 = RING.pow(RING.eta(RING.x(), mN), 2, mN);
    final Polynomial<Z> e2 = RING.pow(RING.eta(X2, mN), 2, mN);
    final Polynomial<Z> e3 = RING.pow(RING.eta(X3, mN), 10);
    final Polynomial<Z> e4 = RING.pow(RING.eta(X6, mN), 14);
    return RING.coeff(RING.multiply(RING.multiply(e1, e2, mN), e3, mN), e4, mN);
  }
}
