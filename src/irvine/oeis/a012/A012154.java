package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012154 sech(tan(tan(x))) = 1-1/2!*x^2-11/4!*x^4-253/6!*x^6-9015/8!*x^8 ... .
 * @author Sean A. Irvine
 */
public class A012154 extends Sequence0 {

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
    return RING.sech(RING.tan(RING.tan(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
