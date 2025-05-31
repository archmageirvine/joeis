package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383989 Series expansion of the exponential generating function ff6^!(exp(x)-1) where ff6^!(x) = x * (1-3*x-x^2+x^3) / (1+3*x+x^2-x^3).
 * @author Sean A. Irvine
 */
public class A383989 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = Polynomial.create(Q.ZERO, Q.ONE, new Q(-3), Q.NEG_ONE, Q.ONE);
  private static final Polynomial<Q> DEN = Polynomial.create(Q.ONE, Q.THREE, Q.ONE, Q.NEG_ONE);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Polynomial<Q> p = RING.series(NUM, DEN, mN);
    final Polynomial<Q> e = RING.negate(RING.subtract(RING.one(), RING.exp(RING.x(), mN)));
    return RING.substitute(p, e, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
