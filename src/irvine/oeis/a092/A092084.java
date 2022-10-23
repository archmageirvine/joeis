package irvine.oeis.a092;
// manually egfsi at 2021-12-01 18:58

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A092084 Row sums of triangle A092082 (S2(7) Stirling2 generalization).
 * E.g.f.:
 * @author Georg Fischer
 */
public class A092084 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  {
    next();
  }

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.subtract(RING.exp(RING.add(RING.negate(RING.one()), RING.exp(RING.multiply(RING.log(RING.subtract(RING.one(), RING.monomial(Q.SIX, 1)), mN), RING.negate(RING.series(RING.one(), RING.monomial(Q.SIX, 0), mN)), mN), mN)), mN), RING.one()).coeff(mN).multiply(mF).toZ();
  }
}
