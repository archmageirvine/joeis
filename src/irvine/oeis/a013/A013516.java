package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013516.
 * @author Sean A. Irvine
 */
public class A013516 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.den().shiftLeft(mN);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return select(Q.ONE);
    }
    return select(RING.exp(RING.tan(RING.x(), mN), mN).coeff(mN));
  }
}
