package irvine.oeis.a245;
// manually egfsi at 2021-12-02 10:07

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A245856 Number of preferential arrangements of n labeled elements such that the minimal number of elements per rank equals 3.
 * E.g.f.:
 * @author Georg Fischer
 */
public class A245856 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 2;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.subtract(RING.series(RING.one(), RING.add(RING.add(RING.subtract(RING.monomial(new Q(2), 0), RING.exp(RING.x(), mN)), RING.x()), RING.series(RING.pow(RING.x(), 2, mN), RING.monomial(new Q(2), 0), mN)), mN), RING.series(RING.one(), RING.add(RING.add(RING.add(RING.subtract(RING.monomial(new Q(2), 0), RING.exp(RING.x(), mN)), RING.x()), RING.series(RING.pow(RING.x(), 2, mN), RING.monomial(new Q(2), 0), mN)), RING.series(RING.pow(RING.x(), 3, mN), RING.monomial(new Q(6), 0), mN)), mN)).coeff(mN).multiply(mF).toZ();
  }
}
