package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013497.
 * @author Sean A. Irvine
 */
public class A013497 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return RING.log(RING.subtract(RING.cosh(RING.x(), mN), RING.log1p(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
