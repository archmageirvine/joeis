package irvine.oeis.a061;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A061133 Number of degree-n even permutations of order exactly 6.
 * E.g.f.: exp(x) - 1/2*exp(x + 1/2*x^2) - 1/2*exp(x - 1/2*x^2) - exp(x + 1/3*x^3) + 1/2*exp(x + 1/2*x^2 + 1/3*x^3 + 1/6*x^6) + 1/2*exp(x - 1/2*x^2 + 1/3*x^3 - 1/6*x^6)
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A061133 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C2P = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF);
  private static final Polynomial<Q> C2M = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF.negate());
  private static final Polynomial<Q> C3 = Polynomial.create(Q.ZERO, Q.ONE, Q.ZERO, Q.ONE_THIRD);
  private static final Polynomial<Q> C6P = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF, Q.ONE_THIRD, Q.ZERO, Q.ZERO, new Q(1, 6));
  private static final Polynomial<Q> C6M = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF.negate(), Q.ONE_THIRD, Q.ZERO, Q.ZERO, new Q(-1, 6));
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.add(RING.add(RING.subtract(RING.subtract(RING.subtract(RING.exp(RING.x(), mN), RING.multiply(RING.exp(C2P, mN), Q.HALF)), RING.multiply(RING.exp(C2M, mN), Q.HALF)), RING.exp(C3, mN)), RING.multiply(RING.exp(C6P, mN), Q.HALF)), RING.multiply(RING.exp(C6M, mN), Q.HALF)).coeff(mN).multiply(mF).toZ();
  }
}
