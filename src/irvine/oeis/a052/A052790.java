package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052790 Expansion of e.g.f.: x^2*log(1-x)^4.
 * @author Sean A. Irvine
 */
public class A052790 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X1 = RING.oneMinusXToTheN(1);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.pow(RING.log(X1, mN), 4, mN).shift(2).coeff(mN).multiply(mF).toZ();
  }
}
