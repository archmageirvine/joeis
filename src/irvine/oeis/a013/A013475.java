package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013475 Coefficient of [x^(4*n+2)] in e.g.f. sinh(cosh(x) - cos(x)).
 * @author Sean A. Irvine
 */
public class A013475 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    mN += 4;
    if (mN == 2) {
      return Z.TWO;
    }
    mF = mF.multiply(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3);
    return RING.sinh(RING.subtract(RING.cosh(RING.x(), mN), RING.cos(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
