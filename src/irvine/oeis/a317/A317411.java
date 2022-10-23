package irvine.oeis.a317;
// manually egfsi at 2021-12-02 10:07

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A317411 Expansion of e.g.f. tanh(x/(1 - x)).
 * E.g.f.:
 * @author Georg Fischer
 */
public class A317411 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    } else {
      return Z.ZERO;
    }
    return RING.tanh(RING.series(RING.x(), RING.oneMinusXToTheN(1), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
