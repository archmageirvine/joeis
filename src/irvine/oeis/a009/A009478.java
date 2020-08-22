package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009478 Expansion of sin(sin(x))*x.
 * @author Sean A. Irvine
 */
public class A009478 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -3;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == -1) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN).multiply(mN + 1);
    return RING.sin(RING.sin(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
