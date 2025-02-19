package irvine.oeis.a185;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A185387 Expansion of e.g.f. exp(x)+log(1/(1-x)).
 * E.g.f.: exp(x)+log(1/(1-x))
 * @author Georg Fischer
 */
public class A185387 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.add(RING.exp(RING.x(), mN), RING.log(RING.series(RING.one(), RING.oneMinusXToTheN(1), mN), mN)).coeff(mN).multiply(mF).toZ();
  }
}
