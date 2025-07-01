package irvine.oeis.a006;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006228 Expansion of e.g.f. exp(arcsin(x)).
 * @author Sean A. Irvine
 */
public class A006228 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.asin(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
