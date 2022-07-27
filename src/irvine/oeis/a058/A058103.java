package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058103 McKay-Thompson series of class 10b for Monster.
 * @author Sean A. Irvine
 */
public class A058103 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C2 = RING.monomial(Q.TWO, 1);
  private static final Polynomial<Q> C25 = RING.monomial(new Q(25), 0);
  private static final Polynomial<Q> X2 = RING.monomial(Q.ONE, 2);
  private static final Polynomial<Q> X5 = RING.monomial(Q.ONE, 5);
  private static final Polynomial<Q> X10 = RING.monomial(Q.ONE, 10);
  private static final Polynomial<Q> X25 = RING.monomial(Q.ONE, 25);
  private static final Polynomial<Q> X50 = RING.monomial(Q.ONE, 50);
  private int mN = -1;

  @Override
  public Z next() {
    // Effectively multiply through by q to avoid 1/q term
    ++mN;
    final Polynomial<Q> eta1 = RING.eta(RING.x(), mN);
    final Polynomial<Q> eta2 = RING.eta(X2, mN);
    final Polynomial<Q> eta5 = RING.eta(X5, mN);
    final Polynomial<Q> eta10 = RING.eta(X10, mN);
    final Polynomial<Q> eta25 = RING.eta(X25, mN);
    final Polynomial<Q> eta50 = RING.eta(X50, mN);
    final Polynomial<Q> a = RING.series(eta1, eta25, mN);
    final Polynomial<Q> b = RING.series(RING.multiply(eta2, eta25, mN), RING.multiply(eta1, eta50, mN), mN);
    final Polynomial<Q> t = RING.multiply(eta5, eta10, mN);
    final Polynomial<Q> c = RING.pow(RING.series(RING.multiply(eta1, eta2, mN), t, mN), 2, mN);
    final Polynomial<Q> f5 = RING.pow(RING.series(t, RING.multiply(eta25, eta50, mN), mN), 2, mN);
    final Polynomial<Q> ca = RING.multiply(RING.series(c, RING.pow(a, 2, mN), mN), Q.FIVE).shift(2);
    final Polynomial<Q> ib = RING.pow(RING.subtract(RING.one(), RING.series(RING.x(), b, mN)), 2, mN);
    final Polynomial<Q> u = RING.multiply(ca, ib);
    final Polynomial<Q> v = RING.series(C25, f5, mN).shift(6);
    final Polynomial<Q> gf = RING.add(RING.add(C2, c), RING.add(u, v));
    return gf.coeff(mN).toZ();
  }
}
