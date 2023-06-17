package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003114 Number of partitions of n into parts 5k+1 or 5k+4.
 * @author Sean A. Irvine
 */
public class A003114 extends AbstractSequence {

  /* Construct the sequence. */
  public A003114() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private int mLast = -4;
  private Polynomial<Q> mDen = RING.one();

  @Override
  public Z next() {
    if (++mN >= mLast) {
      mLast += 5;
      mDen = RING.multiply(mDen, RING.multiply(RING.oneMinusXToTheN(mLast + 3), RING.oneMinusXToTheN(mLast)));
    }
    return RING.coeff(RING.one(), mDen, mN).toZ();
  }
}
