package irvine.oeis.a075;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075267 Denominator of the coefficient of x^n in log(-log(1-x)/x).
 * @author Sean A. Irvine
 */
public class A075267 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private int mN = 0;

  @Override
  public Z next() {
    return RING.log(RING.negate(RING.log1p(NEG_X, ++mN + 1).shift(-1)), mN).coeff(mN).den();
  }
}
