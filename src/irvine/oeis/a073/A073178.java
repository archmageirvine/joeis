package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073178 a(n) = n!^2 times coefficient of x^n in e^(x*(3-x)/2/(1-x))/(1-x)^(1/2).
 * @author Sean A. Irvine
 */
public class A073178 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = Polynomial.create(Q.ZERO, new Q(3, 2), new Q(-1, 2));
  private static final Polynomial<Q> C2 = Polynomial.create(Q.ONE, Q.NEG_ONE);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(RING.exp(RING.series(C1, C2, mN), mN), RING.sqrt(C2, mN), mN)
      .multiply(Functions.FACTORIAL.z(mN).square()).toZ();
  }
}
