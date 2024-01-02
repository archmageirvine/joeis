package irvine.oeis.a349;
// manually egfsi at 2023-05-06 22:30

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A349429 Expansion of e.g.f. cos(5*x)*cos(9*x)/cos(15*x) (even powers only).
 * @author Georg Fischer
 */
public class A349429 extends AbstractSequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  /** Construct the sequence. */
  public A349429() {
    super(0);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN != 0) {
        mF = mF.multiply(mN);
      }
      if ((mN & 1) == 0) {
        return RING.series(RING.multiply(RING.cos(RING.monomial(Q.FIVE, 1), mN), RING.cos(RING.monomial(Q.NINE, 1), mN), mN), RING.cos(RING.monomial(new Q(15), 1), mN), mN).coeff(mN).multiply(mF).toZ();
      }
    }
  }
}
