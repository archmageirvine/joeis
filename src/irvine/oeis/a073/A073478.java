package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073451.
 * @author Sean A. Irvine
 */
public class A073478 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> DEN = RING.oneMinusXToTheN(1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Q> sum = RING.zero();
    for (int k = 1; k <= mN; ++k) {
      sum = RING.add(sum, RING.divide(RING.series(RING.oneMinusXToTheN(k), DEN, mN - k).shift(k), Q.valueOf(k)));
    }
    return RING.exp(sum, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
