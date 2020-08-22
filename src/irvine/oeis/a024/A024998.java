package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024998 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is an integer, s(0) = 0, |s(i) - s(i-1)| = 1 for i = 1,2; |s(i) - s(i-1)| &lt;= 1 for i &gt;= 3, s(n) = 1. Also a(n) = T(n,n-1), where T is the array defined in A024996.
 * @author Sean A. Irvine
 */
public class A024998 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN - 1, 2 * k - 1).multiply(Binomial.binomial(2 * k + 1, k)));
    }
    return sum;
  }
}
