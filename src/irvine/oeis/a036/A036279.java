package irvine.oeis.a036;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036279 Denominators in the Taylor series for tan(x).
 * @author Sean A. Irvine
 */
public class A036279 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.tan(RING.x(), mN).coeff(mN));
  }
}

