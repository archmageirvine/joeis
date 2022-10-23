package irvine.oeis.a036;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036778 Number of labeled rooted trees on 2n+1 nodes each node having an even number of children.
 * @author Sean A. Irvine
 */
public class A036778 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    return RING.reversion(RING.series(RING.x(), RING.cosh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
