package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013038 sinh(sinh(x)+arcsin(x))=2*x+10/3!*x^3+122/5!*x^5+2874/7!*x^7...
 * @author Sean A. Irvine
 */
public class A013038 implements Sequence {

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
    return RING.sinh(RING.add(RING.sinh(RING.x(), mN), RING.asin(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
