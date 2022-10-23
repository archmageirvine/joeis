package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006477 Number of partitions of n with at least 1 odd and 1 even part.
 * @author Sean A. Irvine
 */
public class A006477 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> odd = RING.one();
    Polynomial<Z> even = RING.one();
    for (int k = 1; k <= mN; k += 2) {
      odd = RING.multiply(odd, RING.oneMinusXToTheN(k), mN);
      even = RING.multiply(even, RING.oneMinusXToTheN(k + 1), mN);
    }
    odd = RING.subtract(RING.series(RING.one(), odd, mN), RING.one());
    even = RING.subtract(RING.series(RING.one(), even, mN), RING.one());
    return RING.multiply(odd, even, mN).coeff(mN);
  }
}
