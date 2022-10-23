package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013134 sin(tanh(x)+tan(x))=2*x-8/3!*x^3+64/5!*x^5-2816/7!*x^7+80896/9!*x^9...
 * @author Sean A. Irvine
 */
public class A013134 extends Sequence0 {

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
    return RING.sin(RING.add(RING.tanh(RING.x(), mN), RING.tan(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
