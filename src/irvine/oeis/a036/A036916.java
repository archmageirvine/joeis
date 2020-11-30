package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036916 a(n) = Sum(binomial(2*n-2*k,n-k)^2*binomial(n,k)^2, k=0..n).
 * @author Sean A. Irvine
 */
public class A036916 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(2 * mN - 2 * k, mN - k).square().multiply(Binomial.binomial(mN, k).square()));
    }
    return sum;
  }
}
