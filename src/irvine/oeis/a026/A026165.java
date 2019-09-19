package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026165 Number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is a nonnegative integer, <code>s(0) = 2, |s(1) - s(0)| = 1, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2</code>. Also sum of numbers in row <code>n+1</code> of the array T in <code>A026148</code>.
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
