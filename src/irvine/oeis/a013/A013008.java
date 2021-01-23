package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013008 sech(arctan(x)+tan(x))=1-4/2!*x^2+80/4!*x^4-4384/6!*x^6+451328/8!*x^8...
 * @author Sean A. Irvine
 */
public class A013008 implements Sequence {

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
    return RING.sech(RING.add(RING.atan(RING.x(), mN), RING.tan(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
