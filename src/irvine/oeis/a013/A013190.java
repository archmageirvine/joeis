package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013190 log(cosh(x)+arcsinh(x))=x-2/3!*x^3+8/4!*x^4-12/5!*x^5-48/6!*x^6...
 * @author Sean A. Irvine
 */
public class A013190 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.log(RING.add(RING.cosh(RING.x(), mN), RING.asinh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
