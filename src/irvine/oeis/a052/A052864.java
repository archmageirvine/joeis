package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052864 E.g.f.: (log(1-x))^2/(1+log(1-x)).
 * @author Sean A. Irvine
 */
public class A052864 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NX = RING.negate(RING.x());
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> log = RING.log1p(NX, mN);
    return RING.coeff(RING.pow(log, 2, mN), RING.add(RING.one(), log), mN).multiply(mF).toZ();
  }
}
