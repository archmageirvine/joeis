package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A058700 Coefficients of replicable function number 49a.
 * @author Sean A. Irvine
 */
public class A058700 extends AbstractSequence {

  /** Construct the sequence. */
  public A058700() {
    super(-1);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X7 = RING.monomial(Z.ONE, 7);
  private static final Polynomial<Z> X49 = RING.monomial(Z.ONE, 49);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final Polynomial<Z> eta1 = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta7 = RING.eta(X7, mN);
    final Polynomial<Z> eta49 = RING.eta(X49, mN);
    final Polynomial<Z> eta1b = RING.multiply(eta1, eta1, mN);
    final Polynomial<Z> eta49b = RING.multiply(RING.multiply(eta49, eta49, mN), Z.SEVEN);
    final Polynomial<Z> num = RING.add(RING.pow(eta7, 4, mN), RING.multiply(eta1b, eta49b, mN).shift(3));
    final Polynomial<Z> t = RING.add(RING.add(eta1b, RING.multiply(RING.multiply(eta1, eta49, mN), Z.SEVEN).shift(2)), eta49b.shift(4));
    final Polynomial<Z> den = RING.multiply(RING.multiply(eta1, eta49, mN), t);
    return RING.coeff(num, den, mN);
  }
}
