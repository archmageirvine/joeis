package irvine.oeis.a060;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060313 Number of homeomorphically irreducible rooted trees (also known as series-reduced rooted trees, or rooted trees without nodes of degree 2) on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A060313 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN - 2; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).multiply(Z.valueOf(mN - k).pow(mN - k - 2).multiply(mF.factorial(mN - 2))).divide(mF.factorial(mN - k - 2)));
    }
    return sum.multiply(mN);
  }
}
