package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003108 Number of partitions of n into cubes.
 * @author Sean A. Irvine
 */
public class A003108 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private int mA = 1;
  private Polynomial<Q> mDen = RING.one();

  @Override
  public Z next() {
    final int c = mA * mA * mA;
    if (++mN >= c) {
      mDen = RING.multiply(mDen, RING.oneMinusXToTheN(c));
      ++mA;
    }
    return RING.coeff(RING.one(), mDen, mN).toZ();
  }
}
