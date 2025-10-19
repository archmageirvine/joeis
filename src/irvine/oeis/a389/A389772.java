package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A152004.
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
