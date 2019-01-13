package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013457.
 * @author Sean A. Irvine
 */
public class A013457 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 3;
  private Z mF = Z.SIX;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.sin(RING.subtract(RING.atanh(RING.x(), mN), RING.tan(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
