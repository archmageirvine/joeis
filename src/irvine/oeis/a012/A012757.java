package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012757 tan(arctanh(x)^2) = 2/2!*x^2 + 16/4!*x^4 + 608/6!*x^6 + 43776/8!*x^8 + ...
 * @author Sean A. Irvine
 */
public class A012757 implements Sequence {

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
    return RING.tan(RING.pow(RING.atanh(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
