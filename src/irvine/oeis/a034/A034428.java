package irvine.oeis.a034;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034428 E.g.f.: 1 - (1-x)*(tan(x) + sec(x)).
 * @author Sean A. Irvine
 */
public class A034428 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X1 = RING.oneMinusXToTheN(1);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    final Polynomial<Q> tan = RING.tan(RING.x(), mN);
    final Polynomial<Q> sec = RING.sec(RING.x(), mN);
    return RING.multiply(RING.add(tan, sec), X1, mN).coeff(mN).multiply(mF).toZ().negate();
  }
}
