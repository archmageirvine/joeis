package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013081 <code>log(arcsinh(x)+exp(x))=2*x-3/2!*x^2+10/3!*x^3-50/4!*x^4+348/5!*x^5..</code>.
 * @author Sean A. Irvine
 */
public class A013081 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.log(RING.add(RING.asinh(RING.x(), mN), RING.exp(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
