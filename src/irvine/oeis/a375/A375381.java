package irvine.oeis.a375;
// Generated by gen_seq4.pl 2025-01-03.ack/egfsi at 2025-01-06 00:11

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A375381 E.g.f.: (exp(-x) - exp(x) - 2)/(exp(-x) + exp(x) - 4).
 * @author Georg Fischer
 */
public class A375381 extends AbstractSequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  /** Construct the sequence. */
  public A375381() {
    super(0);
  }

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.subtract(RING.subtract(RING.exp(RING.subtract(RING.zero(), RING.x()), mN), RING.exp(RING.x(), mN)), RING.monomial(new Q(2), 0)), RING.subtract(RING.add(RING.exp(RING.subtract(RING.zero(), RING.x()), mN), RING.exp(RING.x(), mN)), RING.monomial(new Q(4), 0)), mN).coeff(mN).multiply(mF).toZ();
  }
}
