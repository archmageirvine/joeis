package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025566 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is a nonnegative integer, s(0) = 0, s(1) = 1, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2. Also a(n) = sum of numbers in row n+1 of the array T defined in A026105. Also a(n) = T(n,n), where T is the array defined in A025564.
 * @author Sean A. Irvine
 */
public class A025566 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN - 2, k).multiply(Binomial.binomial(mN - k, k)));
    }
    return sum;
  }
}
