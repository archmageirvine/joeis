package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012668 arcsin(tanh(x)*tan(x))=2/2!*x^2+232/6!*x^6+647072/10!*x^10...
 * @author Sean A. Irvine
 */
public class A012668 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    mN += 4;
    if (mN == 2) {
      return Z.TWO;
    }
    mF = mF.multiply(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3);
    return RING.asin(RING.multiply(RING.tanh(RING.x(), mN), RING.tan(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
