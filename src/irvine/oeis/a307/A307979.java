package irvine.oeis.a307;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307979 Expansion of e.g.f. <code>exp((cosh(x) - cos(x))/2)</code> (even powers only).
 * @author Sean A. Irvine
 */
public class A307979 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    return RING.exp(RING.divide(RING.subtract(RING.cosh(RING.x(), mN), RING.cos(RING.x(), mN)), Q.TWO), mN).coeff(mN).multiply(mF).toZ();
  }
}
