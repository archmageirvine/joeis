package irvine.oeis.a191;
// manually egfsi at 2021-12-02 10:07

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A191719 Expansion of e.g.f. arctan(x*exp(x)).
 * @author Georg Fischer
 */
public class A191719 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.atan(RING.multiply(RING.x(), RING.exp(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
