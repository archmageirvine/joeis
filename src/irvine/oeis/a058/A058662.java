package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058662 McKay-Thompson series of class 40A for Monster.
 * @author Sean A. Irvine
 */
public class A058662 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C4 = RING.monomial(new Q(4), 1);
  private int mN = -1;

  @Override
  public Z next() {
    final Polynomial<Q> eta = RING.eta(RING.x(), ++mN);
    final Polynomial<Q> a = RING.multiply(eta, eta.substitutePower(5, mN), mN);
    final Polynomial<Q> b = RING.multiply(eta.substitutePower(2, mN), eta.substitutePower(10, mN), mN);
    final Polynomial<Q> c = RING.pow(RING.series(a, b, mN), 2, mN);
    final Polynomial<Q> d = RING.add(c, RING.series(C4, c, mN));
    return RING.sqrt(d, mN).coeff(mN).toZ();
  }
}
