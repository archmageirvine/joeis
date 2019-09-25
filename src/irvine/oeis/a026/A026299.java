package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026299 Number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is a nonnegative integer, <code>s(0) = 0, s(1) = 1, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2, |s(2) - s(1)| = 1, |s(3) - s(2)| = 1</code> if <code>s(2) = 1</code>. Also sum of numbers in row <code>n+1</code> of the array T in <code>A026268</code>.
 * @author Sean A. Irvine
 */
public class A026299 extends A026268 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
