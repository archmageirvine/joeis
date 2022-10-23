package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052513 Number of labeled trees of height at most 3.
 * @author Sean A. Irvine
 */
public class A052513 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.exp(RING.exp(RING.x(), mN).shift(1), mN).shift(1), mN).shift(1).coeff(mN).multiply(mF).toZ();
  }
}
