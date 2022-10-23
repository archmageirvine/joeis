package irvine.oeis.a061;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061134 Number of degree-n even permutations of order exactly 8.
 * E.g.f.: - 1/2*exp(x + 1/2*x^2 + 1/4*x^4) - 1/2*exp(x - 1/2*x^2 - 1/4*x^4) + 1/2*exp(x + 1/2*x^2 + 1/4*x^4 + 1/8*x^8) + 1/2*exp(x - 1/2*x^2 - 1/4*x^4 - 1/8*x^8)
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A061134 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C4P = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF, Q.ZERO, Q.ONE_QUARTER);
  private static final Polynomial<Q> C4M = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF.negate(), Q.ZERO, Q.ONE_QUARTER.negate());
  private static final Polynomial<Q> C8P = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF, Q.ZERO, Q.ONE_QUARTER, Q.ZERO, Q.ZERO, Q.ZERO, new Q(1, 8));
  private static final Polynomial<Q> C8M = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF.negate(), Q.ZERO, Q.ONE_QUARTER.negate(), Q.ZERO, Q.ZERO, Q.ZERO, new Q(-1, 8));
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.subtract(RING.subtract(RING.add(RING.exp(C8M, mN), RING.exp(C8P, mN)), RING.exp(C4M, mN)), RING.exp(C4P, mN)).coeff(mN).multiply(mF).toZ().divide2();
  }
}
