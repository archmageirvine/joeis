package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058565 McKay-Thompson series of class 21C for the Monster group.
 * @author Sean A. Irvine
 */
public class A058565 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C4 = RING.monomial(Z.FOUR, 1);
  private int mN = -1;

  @Override
  public Z next() {
    final Polynomial<Z> eta = RING.eta(RING.x(), ++mN);
    final Polynomial<Z> a = RING.multiply(eta, eta.substitutePower(7, mN), mN);
    final Polynomial<Z> b = RING.multiply(eta.substitutePower(2, mN), eta.substitutePower(14, mN), mN);
    final Polynomial<Z> c = RING.series(a, b, mN);
    return c.coeff(mN).add(RING.coeff(C4, RING.pow(c, 2, mN), mN));
  }
}
