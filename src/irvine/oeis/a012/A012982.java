package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012982 cosh(arctan(x)+sin(x))=1+4/2!*x^2-8/4!*x^4-26/6!*x^6+424/8!*x^8...
 * @author Sean A. Irvine
 */
public class A012982 implements Sequence {

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
    return RING.cosh(RING.add(RING.atan(RING.x(), mN), RING.sin(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
