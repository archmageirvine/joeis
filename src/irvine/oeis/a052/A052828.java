package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052828 A simple grammar: union of cycles and cycles of cycles.
 * @author Sean A. Irvine
 */
public class A052828 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X1 = RING.oneMinusXToTheN(1);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> log = RING.log(RING.series(RING.one(), X1, mN), mN);
    return RING.add(log, RING.log(RING.series(RING.one(), RING.subtract(RING.one(), log), mN), mN)).coeff(mN).multiply(mF).toZ();
  }
}

