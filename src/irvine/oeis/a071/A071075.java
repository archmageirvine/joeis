package irvine.oeis.a071;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071075 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = Polynomial.create(Q.ZERO, Q.ZERO, Q.HALF.negate());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.serlaplace(RING.exp(RING.integrate(RING.series(RING.one(), RING.subtract(RING.one(), RING.integrate(RING.exp(C, mN - 1))), mN)), mN)).coeff(mN).toZ();
  }
}
