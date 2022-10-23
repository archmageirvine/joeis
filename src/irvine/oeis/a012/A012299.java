package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012299 Expansion of e.g.f. arcsinh(sin(x)*sin(x)), even indexed terms only.
 * @author Sean A. Irvine
 */
public class A012299 extends Sequence0 {

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
    return RING.asinh(RING.pow(RING.sin(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
