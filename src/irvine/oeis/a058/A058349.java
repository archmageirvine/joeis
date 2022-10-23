package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058349 Number of connected labeled series-parallel posets on n nodes.
 * @author Sean A. Irvine
 */
public class A058349 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return RING.reversion(RING.add(RING.x(), RING.multiply(RING.subtract(RING.one(), RING.cosh(RING.x(), mN)), Q.TWO)), mN).coeff(mN).multiply(mF).toZ();
  }
}
