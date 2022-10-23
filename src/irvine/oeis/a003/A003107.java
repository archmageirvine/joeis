package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003107 Number of partitions of n into Fibonacci parts (with a single type of 1).
 * @author Sean A. Irvine
 */
public class A003107 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private int mA = 0;
  private int mB = 1;
  private Polynomial<Q> mDen = RING.one();

  @Override
  public Z next() {
    if (++mN >= mB) {
      final int t = mA + mB;
      mA = mB;
      mB = t;
      mDen = RING.multiply(mDen, RING.oneMinusXToTheN(t));
    }
    return RING.coeff(RING.one(), mDen, mN).toZ();
  }
}
