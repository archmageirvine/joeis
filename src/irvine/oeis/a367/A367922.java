package irvine.oeis.a367;
// Generated by gen_seq4.pl egfsi at 2024-02-24 18:19

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A367922 Expansion of e.g.f. 1/(1 - x + 2*log(1 - x)).
 * @author Georg Fischer
 */
public class A367922 extends AbstractSequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  /** Construct the sequence. */
  public A367922() {
    super(0);
  }

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.one(), RING.add(RING.oneMinusXToTheN(1), RING.multiply(RING.monomial(Q.TWO, 0), RING.log(RING.oneMinusXToTheN(1), mN), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
