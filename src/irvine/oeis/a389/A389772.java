package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389772 Number of unique nonempty strings with either 0 or 1 copies of a letter i_1, either 0 or 2 copies of a letter i_2, ..., either 0 or n copies of a letter i_n, where i_1, ..., i_n are all distinct letters.
 * @author Sean A. Irvine
 */
public class A389772 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int m = (mN + 1) * mN / 2;
    Polynomial<Q> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.onePlusXToTheN(new Q(Z.ONE, Functions.FACTORIAL.z(k)), k), m);
    }
    prod = RING.serlaplace(prod);
    return RING.eval(prod, Q.ONE).toZ().subtract(1);
  }
}
