package irvine.oeis.a217;
// manually egfsi at 2021-12-02 10:07

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A217714 Modified Euler numbers.
 * E.g.f.: 1/cosh(x) + tanh(x) + 1 - exp(x).
 * @author Georg Fischer
 */
public class A217714 implements Sequence {

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
    return RING.subtract(RING.add(RING.add(RING.series(RING.one(), RING.cosh(RING.x(), mN), mN), RING.tanh(RING.x(), mN)), RING.one()), RING.exp(RING.x(), mN)).coeff(mN).multiply(mF).toZ();
  }
}
