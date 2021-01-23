package irvine.oeis.a008;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008775 Expansion of e.g.f. 2/(1 + cos x * cosh x) in powers of x^4.
 * @author Sean A. Irvine
 */
public class A008775 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.TWO;
  private int mN = -4;

  @Override
  public Z next() {
    mN += 4;
    if (mN > 1) {
      mF = mF.multiply(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3);
    }
    final Polynomial<Q> den = RING.add(RING.one(), RING.multiply(RING.cos(RING.x(), mN), RING.cosh(RING.x(), mN)));
    return RING.coeff(RING.one(), den, mN).multiply(mF).toZ();
  }
}
