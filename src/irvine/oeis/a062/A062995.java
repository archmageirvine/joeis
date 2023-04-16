package irvine.oeis.a062;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062995 Doubly exponentiate the Bessel function I(0,2*sqrt(z)).
 * @author Sean A. Irvine
 */
public class A062995 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mBessel = RING.empty();
  private Z mF2 = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF2 = mF2.multiply((long) mN * mN);
    }
    mBessel.add(mN == 0 ? Q.ZERO : new Q(Z.ONE, mF2));
    return RING.exp(RING.subtract(RING.exp(mBessel, mN), RING.one()), mN).coeff(mN).multiply(mF2).toZ();
  }
}

