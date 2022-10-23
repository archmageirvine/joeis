package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052804 A simple grammar: cycles of rooted cycles.
 * @author Sean A. Irvine
 */
public class A052804 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private Polynomial<Q> mA = RING.zero();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
      mA = RING.negate(RING.log1p(RING.log1p(NEG_X, mN).shift(1), mN));
    }
    return mA.coeff(mN).multiply(mF).toZ();
  }
}
