package irvine.oeis.a024;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024796 Numbers expressible in more than one way as i^2 + j^2 + k^2, where 1 &lt;= i &lt;= j &lt;= k.
 * @author Sean A. Irvine
 */
public class A024796 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long c = 0;
      for (long x = 1; 3 * x * x <= mN; ++x) {
        final long u = mN - x * x;
        for (long y = x; 2 * y * y <= u; ++y) {
          final long v = u - y * y;
          final long s = LongUtils.sqrt(v);
          if (s * s == v && ++c > 1) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
