package irvine.oeis.a067;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067619 Total number of parts in all self-conjugate partitions of n. Also, sum of largest parts of all self-conjugate partitions of n.
 * @author Sean A. Irvine
 */
public class A067619 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int j = 1; j <= mN; ++j) {
      Polynomial<Z> prod = RING.one();
      final int lim = mN - (2 * j - 1);
      for (int k = 1; k <= 2 * j - 3; k += 2) {
        prod = RING.multiply(prod, RING.onePlusXToTheN(k), lim);
      }
      sum = RING.add(sum, RING.multiply(prod, Z.valueOf(j)).shift(2 * j - 1));
    }
    return sum.coeff(mN);
  }
}
