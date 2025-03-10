package irvine.oeis.a346;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A346395 Expansion of e.g.f. -log(1 - x) * exp(3*x).
 * E.g.f.: -log(1 - x) * exp(3*x)
 * @author Georg Fischer
 */
public class A346395 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.negate(RING.multiply(RING.log(RING.oneMinusXToTheN(1), mN), RING.exp(RING.monomial(Q.THREE, 1), mN), mN)).coeff(mN).multiply(mF).toZ();
  }
}
