package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009493 Expansion of sin(sinh(x))*x.
 * @author Sean A. Irvine
 */
public class A009493 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.sin(RING.sinh(RING.x(), mN - 1), mN - 1).coeff(mN - 1).multiply(mF).toZ();
  }
}
