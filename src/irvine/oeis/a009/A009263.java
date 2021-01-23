package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009263 Expansion of e.g.f.: exp(tanh(x)).x.
 * @author Sean A. Irvine
 */
public class A009263 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN + 1);
    return RING.exp(RING.tanh(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
