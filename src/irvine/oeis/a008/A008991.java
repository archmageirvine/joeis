package irvine.oeis.a008;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008991.
 * @author Sean A. Irvine
 */
public class A008991 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.sqrt(RING.sin(RING.x(), mN + 1).shift(-1), mN).coeff(mN));
  }
}

