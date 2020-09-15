package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058570 McKay-Thompson series of class 23A for Monster.
 * @author Sean A. Irvine
 */
public class A058570 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C4 = RING.monomial(Z.FOUR, 2);
  private int mN = 2;

  @Override
  public Z next() {
    final Polynomial<Z> eta = RING.eta(RING.x(), ++mN);
    final Polynomial<Z> a = RING.multiply(eta, eta.substitutePower(23, mN), mN);
    final Polynomial<Z> b = RING.multiply(eta.substitutePower(2, mN), eta.substitutePower(46, mN), mN);
    final Polynomial<Z> c = RING.series(a, b, mN);
    final Polynomial<Z> d = RING.pow(c, 2, mN);
    return RING.coeff(RING.multiply(RING.add(c, RING.x()).shift(3), RING.add(d, C4), mN), d, mN);
  }
}
