package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073179 a(n) = n!^2 times coefficient of x^n in Sum_{k&gt;=0} x^k/k!^2/4^k*((2-x)/(1-x))^(2*k).
 * @author Sean A. Irvine
 */
public class A073179 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = Polynomial.create(Q.TWO, Q.NEG_ONE);
  private static final Polynomial<Q> C2 = Polynomial.create(Q.ONE, Q.NEG_ONE);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Q> sum = RING.zero();
    final Polynomial<Q> r = RING.series(C1, C2, mN);
    for (int k = 0; k <= mN; ++k) {
      final Polynomial<Q> t = RING.multiply(RING.pow(r, 2L * k, mN - k), new Q(1, Functions.FACTORIAL.z(k).square().shiftLeft(2L * k)));
      sum = RING.add(sum, t.shift(k));
    }
    return sum.coeff(mN).multiply(Functions.FACTORIAL.z(mN).square()).toZ();
  }
}
