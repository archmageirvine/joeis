package irvine.oeis.a061;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A061125 Number of degree-n permutations of order exactly 12.
 * E.g.f.: exp(x + 1/2*x^2) - exp(x + 1/2*x^2 + 1/4*x^4) - exp(x + 1/2*x^2 + 1/3*x^3 + 1/6*x^6) + exp(x + 1/2*x^2 + 1/3*x^3 + 1/4*x^4 + 1/6*x^6 + 1/12*x^12)
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A061125 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  static final Polynomial<Q> C6 = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF, Q.ONE_THIRD, Q.ZERO, Q.ZERO, new Q(1, 6));
  static final Polynomial<Q> C4 = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF, Q.ZERO, Q.ONE_QUARTER);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.add(RING.subtract(RING.subtract(RING.exp(RING.add(RING.x(), RING.multiply(RING.series(RING.one(), RING.monomial(Q.TWO, 0), mN), RING.pow(RING.x(), 2, mN), mN)), mN), RING.exp(C4, mN)), RING.exp(C6, mN)), RING.exp(A061127.C12, mN)).coeff(mN).multiply(mF).toZ();
  }
}
