package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013260 Expansion of e.g.f. tan(log(x+1) - sinh(x)).
 * @author Sean A. Irvine
 */
public class A013260 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.tan(RING.subtract(RING.log1p(RING.x(), mN), RING.sinh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
