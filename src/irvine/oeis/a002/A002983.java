package irvine.oeis.a002;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002983 Expansion of e.g.f. 1/(1 - x*exp(x) + x^2*exp(2*x)).
 * @author Sean A. Irvine
 */
public class A002983 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO_X = RING.create(Arrays.asList(Q.ZERO, Q.TWO));
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.one(),
      RING.add(RING.subtract(RING.one(), RING.shift(RING.exp(RING.x(), mN), 1)),
        RING.shift(RING.exp(TWO_X, mN), 2)), mN).coeff(mN).multiply(mF).toZ();
  }
}
