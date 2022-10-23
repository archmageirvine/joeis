package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009687 Expansion of sinh(sin(x))*sin(x)/2.
 * @author Sean A. Irvine
 */
public class A009687 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 4;
    if (mN == 2) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3);
    return RING.tan(RING.multiply(RING.sinh(RING.x(), mN), RING.sin(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
