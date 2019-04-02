package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007381 7th order maximal independent sets in path graph.
 * @author Sean A. Irvine
 */
public class A007381 implements Sequence {

  private long mN = 9;

  protected Z t(final long a, final long b, final long n) {
    Z sum = Z.ZERO;
    for (long x = 0; a * x <= n; ++x) {
      final long by = n - a * x;
      if (by % b == 0) {
        final long y = by / b;
        sum = sum.add(Binomial.binomial(x + y, y));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    return t(2, 9, ++mN);
  }
}
