package irvine.oeis.a120;
// manually egfsi at 2022-04-29 11:22

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A120419 E.g.f. A(x) satisfies A(x) = (1 + (Integral A(x) dx)^2 / 2)^2.
 * E.g.f.:
 * @author Georg Fischer
 */
public class A120419 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;
  private Z mZ = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN != 0) {
      mF = mF.multiply(mN);
    }
    final Z result = RING.pow(RING.add(RING.one(), RING.pow(RING.reversion(RING.series(RING.multiply(RING.pow(RING.monomial(new Q(2), 0), Q.HALF, mN), RING.add(RING.atan(RING.x(), mN), RING.series(RING.x(), RING.onePlusXToTheN(2), mN)), mN), RING.monomial(new Q(2), 0), mN), mN), 2, mN)), 2, mN).coeff(mN).multiply(mF).toZ().divide(mZ);
    mZ = mZ.multiply(2);
    ++mN;
    mF = mF.multiply(mN);
    return result;
  }
}
