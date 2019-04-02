package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000716 Number of partitions of n into parts of 3 kinds.
 * @author Sean A. Irvine
 */
public class A000716 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= mN; ++k) {
      den = RING.multiply(den, RING.pow(RING.oneMinusXToTheN(k), 3, mN), mN);
    }
    return RING.coeff(RING.one(), den, mN);
  }
}
