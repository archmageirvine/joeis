package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076687 Coefficients in asymptotic (divergent) expansion for Sum_{k=1..n} 1/C(n,k)^2.
 * @author Sean A. Irvine
 */
public class A076687 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Polynomial<Q> sum = RING.zero();
    for (int k = 1; k <= mN / 2; ++k) {
      Polynomial<Q> prod = RING.one();
      for (long j = 0; j < k; ++j) {
        prod = RING.multiply(prod, Polynomial.create(Q.ONE, Q.valueOf(-j)));
      }
      final Polynomial<Q> term = RING.series(RING.monomial(new Q(Functions.FACTORIAL.z(k).square()), 2 * k), RING.pow(prod, 2), mN);
      sum = RING.add(sum, term);
    }
    return sum.coeff(mN).multiply(2).toZ();
  }
}
