package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054780 Number of n-covers of a labeled n-set.
 * @author Sean A. Irvine
 */
public class A054780 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).multiply(Binomial.binomial((1L << (mN - k)) - 1, mN)));
    }
    return sum;
  }
}
