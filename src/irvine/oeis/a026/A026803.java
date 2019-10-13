package irvine.oeis.a026;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026803 Number of partitions of n in which the least part is 10.
 * @author Sean A. Irvine
 */
public class A026803 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -10;

  @Override
  public Z next() {
    if (++mN < 0) {
      return Z.ZERO;
    }
    Polynomial<Z> den = RING.one();
    for (int k = 10; k <= mN; ++k) {
      den = RING.multiply(den, RING.oneMinusXToTheN(k), mN);
    }
    return RING.coeff(RING.one(), den, mN);
  }
}

