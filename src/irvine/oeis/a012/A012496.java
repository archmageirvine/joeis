package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012496 exp(cos(x)*arctan(x))=1+x+1/2!*x^2-4/3!*x^3-19/4!*x^4+445/6!*x^6...
 * @author Sean A. Irvine
 */
public class A012496 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.exp(RING.multiply(RING.cos(RING.x(), mN), RING.atan(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
