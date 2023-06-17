package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A058569 McKay-Thompson series of class 22a for Monster.
 * @author Sean A. Irvine
 */
public class A058569 extends AbstractSequence {

  /* Construct the sequence. */
  public A058569() {
    super(-1);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X4 = RING.monomial(Z.ONE, 4);
  private static final Polynomial<Z> X11 = RING.monomial(Z.ONE, 11);
  private static final Polynomial<Z> X22 = RING.monomial(Z.ONE, 22);
  private static final Polynomial<Z> X44 = RING.monomial(Z.ONE, 44);
  private static final Polynomial<Z> C = RING.monomial(Z.FOUR, 3);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta1 = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta2 = RING.eta(X2, mN);
    final Polynomial<Z> eta4 = RING.eta(X4, mN);
    final Polynomial<Z> eta11 = RING.eta(X11, mN);
    final Polynomial<Z> eta22 = RING.eta(X22, mN);
    final Polynomial<Z> eta44 = RING.eta(X44, mN);
    final Polynomial<Z> a = RING.series(
      RING.pow(RING.multiply(eta2, eta22, mN), 2, mN),
      RING.multiply(RING.multiply(RING.multiply(eta1, eta4, mN), eta11, mN), eta44, mN),
      mN);
    final Polynomial<Z> b = RING.series(
      RING.multiply(eta1, eta11, mN),
      RING.multiply(eta2, eta22, mN),
      mN);
    final Polynomial<Z> a2 = RING.pow(a, 2, mN);
    final Polynomial<Z> ba2 = RING.multiply(b, a2, mN);
    final Polynomial<Z> c = RING.series(C, ba2, mN);
    return RING.coeff(RING.add(ba2, c), RING.pow(b, 2, mN), mN);
  }
}
