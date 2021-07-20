package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002569 Max_{k=0..n} { Number of partitions of n into exactly k parts }.
 * @author Sean A. Irvine
 */
public class A002569 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;
  

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ONE;
    Polynomial<Z> num = RING.one();
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= mN; ++k) {
      num = RING.multiply(num, RING.x(), mN);
      den = RING.multiply(den, RING.oneMinusXToTheN(Z.ONE, k), mN);
      final Z coeff = RING.coeff(num, den, mN);
      if (coeff.compareTo(max) > 0) {
        max = coeff;
      }
    }
    return max;
  }

}
