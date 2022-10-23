package irvine.oeis.a326;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A326242 Number of degree-n odd permutations of order dividing 12.
 * E.g.f.: (1/2)*exp(x + (1/2)*x^2 + (1/3)*x^3 + (1/4)*x^4 + (1/6)*x^6+(1/12)*x^(12)) - (1/2)*exp(x - (1/2)*x^2 + (1/3)*x^3 - (1/4)*x^4 - (1/6)*x^6-(1/12)*x^(12))
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A326242 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  static final Polynomial<Q> C1 = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF, Q.ONE_THIRD, Q.ONE_QUARTER, Q.ZERO, new Q(1, 6), Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, new Q(1, 12));
  static final Polynomial<Q> C2 = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF.negate(), Q.ONE_THIRD, Q.ONE_QUARTER.negate(), Q.ZERO, new Q(-1, 6), Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, new Q(-1, 12));
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.subtract(RING.multiply(RING.exp(C1, mN), Q.HALF), RING.multiply(RING.exp(C2, mN), Q.HALF)).coeff(mN).multiply(mF).toZ();
  }
}
