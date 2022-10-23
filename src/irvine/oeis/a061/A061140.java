package irvine.oeis.a061;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061140 Number of degree-n odd permutations of order exactly 8.
 * E.g.f.: - 1/2*exp(x + 1/2*x^2 + 1/4*x^4) + 1/2*exp(x - 1/2*x^2 - 1/4*x^4) + 1/2*exp(x + 1/2*x^2 + 1/4*x^4 + 1/8*x^8) - 1/2*exp(x - 1/2*x^2 - 1/4*x^4 - 1/8*x^8)
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A061140 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  static final Polynomial<Q> C4N = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF.negate(), Q.ZERO, Q.ONE_QUARTER.negate());
  static final Polynomial<Q> C8N = Polynomial.create(Q.ZERO, Q.ONE, Q.HALF.negate(), Q.ZERO, Q.ONE_QUARTER.negate(), Q.ZERO, Q.ZERO, Q.ZERO, new Q(-1, 8));
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.subtract(RING.add(RING.add(RING.negate(RING.multiply(RING.exp(A061127.C4, mN), Q.HALF)), RING.multiply(RING.exp(C4N, mN), Q.HALF)), RING.multiply(RING.exp(A061127.C8, mN), Q.HALF)), RING.multiply(RING.exp(C8N, mN), Q.HALF)).coeff(mN).multiply(mF).toZ();
  }
}
