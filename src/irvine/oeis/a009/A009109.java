package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009109 Expansion of e.g.f. cos(x)/cosh(sin(x)), even powers only.
 * @author Sean A. Irvine
 */
public class A009109 extends Sequence0 {

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
    return RING.coeff(RING.cos(RING.x(), mN), RING.cosh(RING.sin(RING.x(), mN), mN), mN).multiply(mF).toZ();
  }
}
