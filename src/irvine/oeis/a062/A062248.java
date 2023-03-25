package irvine.oeis.a062;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062248 Expansion of a Schwarzian ({f_{27|3}, tau} / (4*Pi)^2) in powers of q^3.
 * @author Sean A. Irvine
 */
public class A062248 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Q Q27 = new Q(27);
  private static final Q Q48 = new Q(48);
  private static final Q Q216 = new Q(216);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> a1 = RING.pow(RING.eta(RING.x(), mN), 3, mN);
    final Polynomial<Q> a3 = RING.pow(RING.eta(RING.monomial(Q.ONE, 3), mN), 4, mN);
    final Polynomial<Q> a9 = RING.pow(RING.eta(RING.monomial(Q.ONE, 9), mN), 3, mN).shift(1);
    final Polynomial<Q> num = RING.subtract(RING.subtract(
      RING.multiply(
        RING.multiply(RING.add(a1, RING.multiply(a9, Q.THREE)),
          RING.add(a1, RING.multiply(a9, Q.NINE)), mN),
        RING.add(RING.pow(a1, 2, mN), RING.multiply(RING.pow(a9, 2, mN), Q27)), mN),
      RING.multiply(RING.pow(a3, 3, mN), Q48).shift(1)),
      RING.multiply(RING.pow(RING.multiply(a1, a9, mN), 2, mN), Q216));
    return RING.coeff(num, a3, mN).toZ();
  }
}
