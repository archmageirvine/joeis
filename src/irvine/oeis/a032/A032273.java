package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032273 Shifts left 2 places under "DIJ" (bracelet, indistinct, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032273 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mA = RING.x();
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    if ((mN & 1) == 0) {
      mA = RING.integrate(RING.add(RING.one(), RING.integrate(RING.add(RING.one(), A032271.dij(mA, mN)))));
    }
    return mA.coeff(mN).multiply(mF).toZ();
  }
}
