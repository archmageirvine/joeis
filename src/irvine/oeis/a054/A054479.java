package irvine.oeis.a054;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054479 Number of sets of cycle graphs of 2n nodes where the 2-colored edges alternate colors.
 * @author Sean A. Irvine
 */
public class A054479 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = Polynomial.create(Q.ZERO, Q.ZERO, Q.ONE);
  private Z mF = Z.ONE;
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    return RING.coeff(RING.one(), RING.sqrt(RING.multiply(RING.exp(X2, mN), RING.oneMinusXToTheN(2), mN), mN), mN).multiply(mF).toZ();
  }
}
