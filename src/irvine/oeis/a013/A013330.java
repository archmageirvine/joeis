package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013330 E.g.f.: tan(exp(x)-sec(x))=x+3/3!*x^3-4/4!*x^4+37/5!*x^5-180/6!*x^6...
 * @author Sean A. Irvine
 */
public class A013330 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.tan(RING.subtract(RING.exp(RING.x(), mN), RING.sec(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
