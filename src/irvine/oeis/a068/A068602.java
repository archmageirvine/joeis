package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068602 Number of functions f:{0,1,2,...,n} -&gt; {0,1,2,...,n} that satisfy f(0)=0 and f(n)=0, with f nowhere concave upward.
 * @author Sean A. Irvine
 */
public class A068602 extends Sequence0 {

  private int mN = -1;

  private Z f(final int n, final long y0, final long x1, final long y1) {
    if (n == 0 || x1 == n - 1) {
      return Z.ONE;
    }
    Z cnt = Z.ZERO;
    final long ymax = x1 == 0 ? n : Math.min(2 * y1 - y0, n);
    for (long y = y1 - y1 / (n - x1); y <= ymax; ++y) {
      cnt = cnt.add(f(n, y1, x1 + 1, y));
    }
    return cnt;
  }

  @Override
  public Z next() {
    return f(++mN, 0, 0, 0);
  }
}
