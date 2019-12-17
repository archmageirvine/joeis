package irvine.oeis.a028;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028248.
 * @author Sean A. Irvine
 */
public class A028248 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.onePlusXToTheN(1);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.subtract(RING.exp(RING.subtract(RING.exp(RING.x(), mN), C1), mN), RING.one()), mN).coeff(mN).multiply(mF).toZ();
  }
}
