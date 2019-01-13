package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000328.
 * @author Sean A. Irvine
 */
public class A000328 implements Sequence {

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

