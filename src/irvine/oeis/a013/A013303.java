package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013303 sec(log(x+1)-arctanh(x))=1+3/4!*x^4+90/6!*x^6+5145/8!*x^8...
 * @author Sean A. Irvine
 */
public class A013303 implements Sequence {

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
    return RING.sec(RING.subtract(RING.log1p(RING.x(), mN), RING.atanh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
