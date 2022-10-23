package irvine.oeis.a102;
// manually egfsi/egfsie at 2021-12-01 19:29

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A102059 Expansion of e.g.f. cos(arctanh(x)), even powers only.
 * E.g.f.: cos(arctanh(x)), even powers
 * @author Georg Fischer
 */
public class A102059 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while ((++mN & 1) == 1) {
      if (mN != 0) {
        mF = mF.multiply(mN);
      }
    }
    if (mN != 0) {
      mF = mF.multiply(mN);
    } else {
      return Z.ONE;
    }
    return RING.cos(RING.atanh(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
