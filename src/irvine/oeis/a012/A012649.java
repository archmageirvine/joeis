package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012649 sin(arcsinh(x)*arcsinh(x))=2/2!*x^2-8/4!*x^4+8/6!*x^6+2112/8!*x^8...
 * @author Sean A. Irvine
 */
public class A012649 implements Sequence {

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
    return RING.sin(RING.pow(RING.asinh(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
