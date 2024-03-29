package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038571 Number of times n must be differentiated to reach 0.
 * @author Sean A. Irvine
 */
public class A038571 extends Sequence0 {

  private long mN = -1;

  private long diff(final long n) {
    return n < 2 ? 0 : (n ^ (n >>> 1)) - (1L << LongUtils.log2(n));
  }

  @Override
  public Z next() {
    long m = ++mN;
    int c = 0;
    while (m != 0) {
      m = diff(m);
      ++c;
    }
    return Z.valueOf(c);
  }
}
