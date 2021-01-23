package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013077 arctanh(arcsinh(x)+log(x+1))=2*x-1/2!*x^2+17/3!*x^3-54/4!*x^4...
 * @author Sean A. Irvine
 */
public class A013077 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.atanh(RING.add(RING.asinh(RING.x(), mN), RING.log1p(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
