package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009243 Expansion of exp(tan(x))*x.
 * @author Sean A. Irvine
 */
public class A009243 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN + 1);
    return RING.exp(RING.tan(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
