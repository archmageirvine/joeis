package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003717 Expansion of e.g.f. sin(tanh(x)) (odd powers only).
 * @author Sean A. Irvine
 */
public class A003717 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    return RING.sin(RING.tanh(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
