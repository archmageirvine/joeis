package irvine.oeis.a068;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068878 Nonzero denominators in the expansion of sin(x)+exp(x)-1-2x.
 * @author Sean A. Irvine
 */
public class A068878 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 1;

  @Override
  public Z next() {
    if ((++mN & 3) == 3) {
      ++mN;
    }
    return RING.sin(RING.x(), mN).coeff(mN).add(RING.exp(RING.x(), mN).coeff(mN)).den();
  }
}
