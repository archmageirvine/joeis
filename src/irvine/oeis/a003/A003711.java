package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003711.
 * @author Sean A. Irvine
 */
public class A003711 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    return RING.cos(RING.tanh(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
