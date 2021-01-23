package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013417 arcsin(arcsin(x)-arcsinh(x))=2/3!*x^3+450/7!*x^7+2240/9!*x^9...
 * @author Sean A. Irvine
 */
public class A013417 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.asin(RING.subtract(RING.asin(RING.x(), mN), RING.asinh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
