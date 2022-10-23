package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009819 tanh(tan(x)*tan(x))=2/2!*x^2+16/4!*x^4+32/6!*x^6-18944/8!*x^8...
 * @author Sean A. Irvine
 */
public class A009819 extends Sequence0 {

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
    return RING.tanh(RING.pow(RING.tan(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
