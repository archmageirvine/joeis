package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383987 Series expansion of the exponential generating function -tridend(-(1-exp(x))) where tridend(x) = (1 - 3*x - sqrt(1+6*x+x^2)) / (4*x) (A001003).
 * @author Sean A. Irvine
 */
public class A383987 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = Polynomial.create(Q.ZERO, Q.SIX, Q.ONE);
  private static final Polynomial<Q> C2 = Polynomial.create(Q.ONE, Q.THREE);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Polynomial<Q> p = RING.multiply(RING.subtract(C2, RING.sqrt1p(C1, mN + 1)), Q.ONE_QUARTER).shift(-1);
    final Polynomial<Q> e = RING.negate(RING.subtract(RING.one(), RING.exp(RING.x(), mN)));
    return RING.substitute(p, e, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
