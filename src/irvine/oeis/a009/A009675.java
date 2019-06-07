package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009675 <code>Tan(sin(x)^2) = 2/2!*x^2 - 8/4!*x^4 + 272/6!*x^6 - 13568/8!*x^8 + ..</code>.
 * @author Sean A. Irvine
 */
public class A009675 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.tan(RING.pow(RING.sin(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
