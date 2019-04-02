package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005758 Number of partitions of n into parts of 12 kinds.
 * @author Sean A. Irvine
 */
public class A005758 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private Polynomial<Z> mDen = RING.one();

  @Override
  public Z next() {
    if (++mN > 0) {
      mDen = RING.multiply(mDen, RING.pow(RING.oneMinusXToTheN(mN), 12));
    }
    return RING.coeff(RING.one(), mDen, mN);
  }
}
