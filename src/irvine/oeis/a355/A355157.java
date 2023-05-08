package irvine.oeis.a355;
// manually egfsi at 2023-05-06 22:30

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A355157 E.g.f.: exp(-x*tan(x)/2).
 * @author Georg Fischer
 */
public class A355157 extends AbstractSequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  /** Construct the sequence. */
  public A355157() {
    super(0);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN != 0) {
        mF = mF.multiply(mN);
      }
      if ((mN & 1) == 0) {
        return RING.exp(RING.subtract(RING.zero(), RING.series(RING.multiply(RING.x(), RING.tan(RING.x(), mN), mN), RING.monomial(new Q(2), 0), mN)), mN).coeff(mN).multiply(mF).toZ();
      }
    }
  }
}
