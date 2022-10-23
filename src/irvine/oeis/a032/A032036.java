package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032036 Shifts left 3 places under "AIJ" (ordered, indistinct, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032036 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private Polynomial<Q> mEGF = RING.x();
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mEGF = RING.integrate(RING.add(RING.one(), RING.integrate(RING.add(RING.one(), RING.integrate(RING.series(RING.one(), RING.subtract(RING.one(), mEGF), mN))))));
    return mEGF.coeff(mN).multiply(mF).toZ();
  }
}
