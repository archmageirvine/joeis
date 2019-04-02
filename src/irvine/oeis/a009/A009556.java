package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009556 Expansion of e.g.f. sin(x)/cos(tanh(x)) (odd powers only).
 * @author Sean A. Irvine
 */
public class A009556 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.coeff(RING.sin(RING.x(), mN), RING.cos(RING.tanh(RING.x(), mN), mN), mN).multiply(mF).toZ();
  }
}
