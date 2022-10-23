package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000328 Number of points of norm &lt;= n^2 in square lattice.
 * @author Sean A. Irvine
 */
public class A000328 extends Sequence0 {

  // Method due to Max Alekseyev

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long nsq = mN * (long) mN;
    final long lim = nsq / 4;
    Z s = Z.ZERO;
    for (long k = 0, j = 1, i = 3; k <= lim; ++k, j += 4, i += 4) {
      s = s.add(nsq / j).subtract(nsq / i);
    }
    return s.shiftLeft(2).add(1);
  }
}

