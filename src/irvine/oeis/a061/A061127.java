package irvine.oeis.a061;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A061127 Number of degree-n permutations of order exactly 24.
 * E.g.f.: exp(x + 1/2*x^2 + 1/4*x^4) - exp(x + 1/2*x^2 + 1/4*x^4 + 1/8*x^8) - exp(x + 1/2*x^2 + 1/3*x^3 + 1/4*x^4 + 1/6*x^6 + 1/12*x^12) + exp(x + 1/2*x^2 + 1/3*x^3 + 1/4*x^4 + 1/6*x^6 + 1/8*x^8 + 1/12*x^12 + 1/24*x^24)
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A061127 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  static final Polynomial<Q> C4 = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF, Q.ZERO, Q.ONE_QUARTER);
  static final Polynomial<Q> C8 = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF, Q.ZERO, Q.ONE_QUARTER, Q.ZERO, Q.ZERO, Q.ZERO, new Q(1, 8));
  static final Polynomial<Q> C12 = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF, Q.ONE_THIRD, Q.ONE_QUARTER, Q.ZERO, new Q(1, 6), Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, new Q(1, 12));
  static final Polynomial<Q> C24 = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF, Q.ONE_THIRD, Q.ONE_QUARTER, Q.ZERO, new Q(1, 6), Q.ZERO, new Q(1, 8), Q.ZERO, Q.ZERO, Q.ZERO, new Q(1, 12), Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, new Q(1, 24));
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.add(RING.subtract(RING.subtract(RING.exp(C4, mN), RING.exp(C8, mN)), RING.exp(C12, mN)), RING.exp(C24, mN)).coeff(mN).multiply(mF).toZ();
  }
}
