package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012756 exp(arctanh(x)*arctanh(x))=1+2/2!*x^2+28/4!*x^4+968/6!*x^6+61584/8!*x^8...
 * @author Sean A. Irvine
 */
public class A012756 implements Sequence {

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
    return RING.exp(RING.pow(RING.atanh(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
