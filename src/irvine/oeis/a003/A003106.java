package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003106 Number of partitions of n into parts 5k+2 or 5k+3.
 * @author Sean A. Irvine
 */
public class A003106 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private int mLast = -3;
  private Polynomial<Q> mDen = RING.one();

  @Override
  public Z next() {
    if (++mN >= mLast) {
      mLast += 5;
      mDen = RING.multiply(mDen, RING.multiply(RING.oneMinusXToTheN(mLast + 1), RING.oneMinusXToTheN(mLast)));
    }
    return RING.coeff(RING.one(), mDen, mN).toZ();
  }
}
