package irvine.oeis.a107;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A107403 Expansion of e.g.f. 1/(1 - 3*sinh(x)).
 * E.g.f.: 1/(1-3*sinh(x))
 * @author Georg Fischer
 */
public class A107403 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.one(), RING.subtract(RING.one(), RING.multiply(RING.monomial(Q.THREE, 0), RING.sinh(RING.x(), mN), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
