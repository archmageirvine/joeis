package irvine.oeis.a190;
// manually egfsi at 2024-02-24 18:19

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A190818 Expansion of e.g.f.: 1/(1-2*tanh(x)).
 * @author Georg Fischer
 */
public class A190818 extends AbstractSequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  /** Construct the sequence. */
  public A190818() {
    super(0);
  }

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.one(), RING.subtract(RING.one(), RING.multiply(RING.monomial(new Q(2), 0),
      RING.tanh(RING.x(), mN), mN)), mN).coeff(mN).multiply(mF).toZ().abs();
  }
}
