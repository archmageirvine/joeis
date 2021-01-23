package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012987 arcsin(arctan(x)+arcsin(x))=2*x+7/3!*x^3+281/5!*x^5+26177/7!*x^7...
 * @author Sean A. Irvine
 */
public class A012987 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.TWO;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.asin(RING.add(RING.atan(RING.x(), mN), RING.asin(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
