package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036915 Sum_{k=0..n} C(2*n-2*k,n-k)^2 * C(2*n,k)^2.
 * @author Sean A. Irvine
 */
public class A036915 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(2 * mN - 2 * k, mN - k).square().multiply(Binomial.binomial(2 * mN, k).square()));
    }
    return sum;
  }
}
