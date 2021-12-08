package irvine.oeis.a182;
// manually egfsi at 2021-12-02 10:07

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A182661 Expansion of x^3*exp(-x)/(3*(1-x)).
 * @author Georg Fischer
 */
public class A182661 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.multiply(RING.pow(RING.x(), 3, mN), RING.exp(RING.negate(RING.x()), mN), mN), RING.multiply(RING.monomial(Q.THREE, 0), RING.oneMinusXToTheN(1), mN), mN).coeff(mN).multiply(mF).toZ().multiply2();
  }
}
