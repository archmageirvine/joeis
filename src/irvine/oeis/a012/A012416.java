package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012416 arctanh(arctan(x)*exp(x))=x+2/2!*x^2+3/3!*x^3+20/4!*x^4+173/5!*x^5...
 * @author Sean A. Irvine
 */
public class A012416 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.atanh(RING.multiply(RING.atan(RING.x(), mN), RING.exp(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
