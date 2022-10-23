package irvine.oeis.a032;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032272 Shifts left under "DIJ" (bracelet, indistinct, labeled) transform, with a(1)=2.
 * @author Sean A. Irvine
 */
public class A032272 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = RING.create(Collections.singletonList(Q.TWO));
  private Polynomial<Q> mA = RING.zero();
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA = RING.integrate(RING.add(TWO, A032271.dij(mA, mN)));
    return mA.coeff(mN).multiply(mF).toZ();
  }
}
