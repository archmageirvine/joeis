package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013046 arcsin(sinh(x)+tan(x))=2*x+11/3!*x^3+425/5!*x^5+46881/7!*x^7...
 * @author Sean A. Irvine
 */
public class A013046 extends Sequence0 {

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
    return RING.asin(RING.add(RING.sinh(RING.x(), mN), RING.tan(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
