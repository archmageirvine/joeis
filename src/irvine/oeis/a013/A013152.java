package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013152 E.g.f.: log(tanh(x)+cos(x))=x-2/2!*x^2+3/3!*x^3-12/4!*x^4+65/5!*x^5...
 * @author Sean A. Irvine
 */
public class A013152 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.log(RING.add(RING.tanh(RING.x(), mN), RING.cos(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
