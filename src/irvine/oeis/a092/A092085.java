package irvine.oeis.a092;
// manually egfsi at 2021-12-01 18:58

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A092085 Alternating row sums of triangle A092082 (S2(7) Stirling2 generalization).
 * E.g.f.: 1-exp(1-(1-6*x)^(-1/6)).
 * @author Georg Fischer
 */
public class A092085 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  /** Construct the sequence. */
  public A092085() {
    next();
  }

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.subtract(RING.one(), RING.exp(RING.subtract(RING.one(), RING.exp(RING.multiply(RING.log(RING.subtract(RING.one(), RING.monomial(Q.SIX, 1)), mN), RING.series(RING.one(), RING.monomial(new Q(-6), 0), mN), mN), mN)), mN)).coeff(mN).multiply(mF).toZ();
  }
}
