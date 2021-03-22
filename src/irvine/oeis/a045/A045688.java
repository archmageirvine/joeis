package irvine.oeis.a045;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045688 Numerators of expansion of tan(sin(x)) - sin(tan(x)).
 * @author Sean A. Irvine
 */
public class A045688 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.subtract(RING.tan(RING.sin(RING.x(), mN), mN), RING.sin(RING.tan(RING.x(), mN), mN)).coeff(mN));
  }
}
