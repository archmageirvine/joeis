package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013340 arctanh(exp(x)-sech(x))=x+2/2!*x^2+3/3!*x^3+20/4!*x^4+165/5!*x^5...
 * @author Sean A. Irvine
 */
public class A013340 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.atanh(RING.subtract(RING.exp(RING.x(), mN), RING.sech(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
