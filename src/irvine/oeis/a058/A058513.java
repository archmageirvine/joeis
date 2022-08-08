package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058513 McKay-Thompson series of class 15b for Monster.
 * @author Sean A. Irvine
 */
public class A058513 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C5 = RING.monomial(Q.FIVE, 0);
  private static final Polynomial<Q> C5_2 = C5.shift(2);
  private static final Polynomial<Q> C5_4 = C5.shift(4);
  private static final Polynomial<Q> C5_6 = C5.shift(6);
  private static final Polynomial<Q> X3 = RING.monomial(Q.ONE, 3);
  private static final Polynomial<Q> X5 = RING.monomial(Q.ONE, 5);
  private static final Polynomial<Q> X15 = RING.monomial(Q.ONE, 15);
  private static final Polynomial<Q> X25 = RING.monomial(Q.ONE, 25);
  private static final Polynomial<Q> X75 = RING.monomial(Q.ONE, 75);
  private int mN = -1;

  @Override
  public Z next() {
    // Effectively multiply through by q to avoid 1/q term
    if (++mN == 1) {
      return Z.ZERO;
    }
    final Polynomial<Q> eta1 = RING.eta(RING.x(), mN);
    final Polynomial<Q> eta3 = RING.eta(X3, mN);
    final Polynomial<Q> eta5 = RING.eta(X5, mN);
    final Polynomial<Q> eta15 = RING.eta(X15, mN);
    final Polynomial<Q> eta25 = RING.eta(X25, mN);
    final Polynomial<Q> eta75 = RING.eta(X75, mN);
    final Polynomial<Q> a = RING.series(eta1, eta25, mN);
    final Polynomial<Q> b = RING.series(eta3, eta75, mN);
    final Polynomial<Q> c = RING.pow(RING.series(RING.multiply(eta3, eta5, mN), RING.multiply(eta1, eta15, mN), mN), 3, mN);
    final Polynomial<Q> d = RING.pow(RING.series(eta3, eta15, mN), 2, mN);
    final Polynomial<Q> t25a = RING.add(a, RING.series(C5_2, a, mN));
    final Polynomial<Q> t25b = RING.add(b, RING.series(C5_6, b, mN));
    final Polynomial<Q> t = RING.subtract(RING.multiply(t25a, t25b, mN), C5_4);
    final Polynomial<Q> u = RING.subtract(b, a.shift(2));
    final Polynomial<Q> tu = RING.multiply(t, u, mN);
    final Polynomial<Q> v = RING.pow(RING.series(RING.one(), RING.multiply(a, b, mN), mN), 2, mN);
    final Polynomial<Q> tuv = RING.multiply(tu, v, mN);
    final Polynomial<Q> w = RING.series(RING.pow(d, 3, mN), c, mN);
    final Polynomial<Q> gf = RING.multiply(tuv, w, mN); // except for n=1 (because 2 was not added)
    return gf.coeff(mN).toZ();
  }
}
