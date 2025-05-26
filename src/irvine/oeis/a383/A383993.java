package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383993 Series expansion of the exponential generating function exp(tridup(x)) - 1 where tridup = x / ((1+x) * (1+2*x)).
 * @author Sean A. Irvine
 */
public class A383993 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = Polynomial.create(Q.ONE, Q.THREE, Q.TWO);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Polynomial<Q> p = RING.series(RING.x(), C1, mN);
    return RING.exp(p, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
