package irvine.oeis.a130;
// Generated by gen_seq4.pl egfsi at 2024-02-24 18:19

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A130915 Number of permutations in the symmetric group S_n in which cycle lengths are odd and greater than 1.
 * @author Georg Fischer
 */
public class A130915 extends AbstractSequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  /** Construct the sequence. */
  public A130915() {
    super(0);
  }

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.multiply(RING.exp(RING.subtract(RING.zero(), RING.x()), mN), RING.pow(RING.series(RING.onePlusXToTheN(1), RING.oneMinusXToTheN(1), mN), Q.HALF, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
