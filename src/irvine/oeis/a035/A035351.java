package irvine.oeis.a035;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035351 Number of labeled rooted polygonal cacti with bridges (mixed Husimi trees) with n nodes.
 * @author Sean A. Irvine
 */
public class A035351 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C2 = RING.create(Collections.singletonList(Q.TWO));
  private Z mF = Z.ONE;
  private Polynomial<Q> mA = RING.x();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      final Polynomial<Q> a2 = RING.multiply(mA, Q.TWO);
      mA = RING.exp(RING.series(RING.subtract(a2, RING.pow(mA, 2, mN)),
        RING.subtract(C2, a2), mN), mN).shift(1);
    }
    return mA.coeff(mN).multiply(mF).toZ();
  }
}

