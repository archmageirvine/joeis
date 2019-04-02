package irvine.oeis.a007;

import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007690 Number of partitions of n in which no part occurs just once.
 * @author Sean A. Irvine
 */
public class A007690 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 2; k <= mN; ++k) {
      if (IntegerUtils.gcd(k, 6) != 1) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(k), mN);
      }
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}
