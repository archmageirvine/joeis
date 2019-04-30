package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013502 <code>exp(sec(x)-cosh(x))=1+4/4!*x^4+60/6!*x^6+1944/8!*x^8+100920/10!*x^10</code>...
 * @author Sean A. Irvine
 */
public class A013502 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.exp(RING.subtract(RING.sec(RING.x(), mN), RING.cosh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
