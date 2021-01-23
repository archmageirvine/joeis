package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026165 Number of (s(0), s(1), ..., s(n)) such that every s(i) is a nonnegative integer, s(0) = 2, |s(1) - s(0)| = 1, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2. Also sum of numbers in row n+1 of the array T in A026148.
 * @author Sean A. Irvine
 */
public class A026165 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Binomial.binomial(k + 1, k / 2)));
    }
    return sum;
  }
}
