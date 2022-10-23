package irvine.oeis.a105;
// manually egfsi at 2021-12-01 19:29

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A105072 Number of permutations on [n] whose local maxima are in ascending order.
 * E.g.f.: exp((6*x-1+exp(2*x))/4)
 * @author Georg Fischer
 */
public class A105072 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    } else {
      return Z.ONE;
    }
    return RING.exp(RING.series(RING.add(RING.subtract(RING.monomial(Q.SIX, 1), RING.one()), RING.exp(RING.monomial(Q.TWO, 1), mN)), RING.monomial(Q.FOUR, 0), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
