package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009072 Expansion of e.g.f. cos(tan(x))/cos(x), even indexed terms only.
 * @author Sean A. Irvine
 */
public class A009072 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.coeff(RING.cos(RING.tan(RING.x(), mN), mN), RING.cos(RING.x(), mN), mN).multiply(mF).toZ();
  }
}
