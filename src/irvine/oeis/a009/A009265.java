package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009265 Expansion of <code>exp(tanh(x))/cosh(x)</code>.
 * @author Sean A. Irvine
 */
public class A009265 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.coeff(RING.exp(RING.tanh(RING.x(), mN), mN), RING.cosh(RING.x(), mN), mN).multiply(mF).toZ();
  }
}
