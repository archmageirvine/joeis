package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013570 Numerator of [x^n] of the Taylor series log(arctan(x)/log(x+1)).
 * @author Sean A. Irvine
 */
public class A013570 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return RING.log(RING.series(RING.atan(RING.x(), mN + 1), RING.log1p(RING.x(), mN + 1), mN), mN).coeff(mN).num();
  }
}
