package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076600.
 * @author Sean A. Irvine
 */
public class A076687 extends Sequence0 {

  private final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Polynomial<Q> sum = RING.zero();
    for (int k = 1; k <= mN / 2; ++k) {
      // Construct (1 - 0x)(1 - 1x)...(1 - (k-1)x)
      Polynomial<Q> prod = RING.one();
      for (int i = 0; i < k; ++i) {
        prod = RING.multiply(prod, Polynomial.create(Q.ONE, Q.valueOf(-i)));
      }
      final Polynomial<Q> term = RING.series(RING.monomial(new Q(Functions.FACTORIAL.z(k).square()), 2 * k), RING.pow(prod, 2), mN);
      sum = RING.add(sum, term);
    }
    return sum.coeff(mN).multiply(2).toZ();
  }
}
