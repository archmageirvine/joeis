package irvine.oeis.a368;
// Generated by gen_seq4.pl egfsi at 2024-02-24 18:19

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A368320 Expansion of e.g.f. exp(3*x) / (3 - 2*exp(x)).
 * @author Georg Fischer
 */
public class A368320 extends AbstractSequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  /** Construct the sequence. */
  public A368320() {
    super(0);
  }

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.exp(RING.monomial(Q.THREE, 1), mN), RING.subtract(RING.monomial(Q.THREE, 0), RING.multiply(RING.monomial(Q.TWO, 0), RING.exp(RING.x(), mN), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
