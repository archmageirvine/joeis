package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025566 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is a nonnegative integer, <code>s(0) = 0, s(1) = 1, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2</code>. Also <code>a(n) =</code> sum of numbers in row <code>n+1</code> of the array T defined in <code>A026105</code>. Also <code>a(n) = T(n,n)</code>, where T is the array defined in <code>A025564</code>.
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
