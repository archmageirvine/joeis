package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000364;

/**
 * A007779 Coefficients of asymptotic expansion of Ramanujan false theta series.
 * @author Sean A. Irvine
 */
public class A007779 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Q QUARTER = Q.ONE_QUARTER;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> num = RING.sqrt1p(RING.x(), mN);
    final Polynomial<Q> den = RING.sqrt(RING.sqrt1m(RING.monomial(Q.ONE, 2), mN), mN);
    final Polynomial<Q> m = RING.series(num, den, mN);
    final Polynomial<Q> log = RING.multiply(RING.log(RING.series(RING.onePlusXToTheN(1), RING.oneMinusXToTheN(1), mN), mN), QUARTER);
    final Sequence euler = new A000364();
    Polynomial<Q> v = RING.one();
    Polynomial<Q> sum = RING.zero();
    for (int k = 0; k <= mN; ++k) {
      sum = RING.add(sum, RING.multiply(v, new Q(euler.next(), mF.factorial(k))));
      v = RING.multiply(v, log, mN);
    }
    return RING.multiply(m, sum, mN).coeff(mN).toZ();
  }
}
