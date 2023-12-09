package irvine.oeis.a067;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067145 Shifts left under reversion.
 * @author Sean A. Irvine
 */
public class A067145 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mGf = RING.x();
  private int mN = 0;

  @Override
  public Z next() {
    mGf = RING.add(RING.one(), RING.reversion(mGf, ++mN)).shift(1);
    return mGf.coeff(mN).toZ();
  }
}
