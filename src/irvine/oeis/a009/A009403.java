package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009403 Expansion of e.g.f. log(1 + tanh(x)^2), even powers only.
 * @author Sean A. Irvine
 */
public class A009403 implements Sequence {

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
    return RING.log1p(RING.pow(RING.tanh(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
