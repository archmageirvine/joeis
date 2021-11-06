package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a006.A006882;

/**
 * A052319 Number of increasing rooted trimmed trees with n nodes.
 * @author Sean A. Irvine
 */
public class A052319 extends A006882 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private final Polynomial<Q> mBPrime = RING.empty();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mBPrime.add(new Q(super.next(), mF));
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> b = RING.add(RING.one(), RING.integrate(mBPrime));
    return RING.coeff(RING.one(), RING.substitute(b, NEG_X, mN), mN).multiply(mF).toZ();
  }
}
