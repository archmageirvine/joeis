package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052835 E.g.f.: 1/(1+log(1-x))-log(1-x).
 * @author Sean A. Irvine
 */
public class A052835 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X1 = RING.oneMinusXToTheN(1);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> log = RING.log(X1, mN);
    return RING.coeff(RING.one(), RING.add(RING.one(), log), mN).subtract(log.coeff(mN)).multiply(mF).toZ();
  }
}

