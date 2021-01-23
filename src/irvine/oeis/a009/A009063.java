package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009063 Expansion of e.g.f. cos(sinh(x)*sin(x)) in powers of x^4.
 * @author Sean A. Irvine
 */
public class A009063 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -4;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 4;
    if (mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3);
    return RING.cos(RING.multiply(RING.sinh(RING.x(), mN), RING.sin(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
