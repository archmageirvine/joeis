package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025179 a(n) = number of (s(0), s(1), ..., s(n)) such that s(i) is an integer, s(0) = 0, |s(1)| = 1, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2, s(n) = 1. Also a(n) = T(n,n-1), where T is the array defined in A025177.
 * @author Sean A. Irvine
 */
public class A025179 extends AbstractSequence {

  /* Construct the sequence. */
  public A025179() {
    super(2);
  }

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
