package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049318 Number of 3-dimensional integer direction vectors (a,b,c) towards grid points at squared integer distance 2n-1 with a &gt;= 0, b &gt;= 0, c &gt;= 0.
 * @author Sean A. Irvine
 */
public class A049318 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    final long len = 2 * ++mN - 1;
    final long s = len * len;
    for (long c = 0; c <= len; ++c) {
      final long r = s - c * c;
      for (long b = 0; b * b <= r; ++b) {
        final long a2 = r - b * b;
        final long a = LongUtils.sqrt(a2);
        if (a * a == a2) {
          if (a != 0) {
            if (LongUtils.gcd(a, b, c) != 1) {
              continue;
            }
          } else if (b != 0) {
            if (LongUtils.gcd(b, c) != 1) {
              continue;
            }
          } else if (c != 1) {
            continue;
          }
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
