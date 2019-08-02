package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025179 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that <code>s(i)</code> is an integer, <code>s(0) = 0, |s(1)| = 1, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2, s(n) = 1</code>. Also <code>a(n) = T(n,n-1)</code>, where T is the array defined in <code>A025177</code>.
 * @author Sean A. Irvine
 */
public class A025179 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN, 2 * k).multiply(Binomial.binomial(2 * k + 1, k + 1)));
    }
    return sum;
  }
}
