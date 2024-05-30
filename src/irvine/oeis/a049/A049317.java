package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049317 Number of 3-dimensional integer direction vectors (a,b,c) towards grid points at squared integer distance 2n-1 with a &gt;= b &gt;= c &gt;= 0.
 * @author Sean A. Irvine
 */
public class A049317 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    final long len = 2 * ++mN - 1;
    final long s = len * len;
    for (long c = 0; c <= len; ++c) {
      final long r = s - c * c;
      for (long b = c; b * b <= r; ++b) {
        final long a2 = r - b * b;
        final long a = Functions.SQRT.l(a2);
        if (a < b) {
          break;
        }
        if (a * a == a2) {
          if (a != 0) {
            if (LongUtils.gcd(a, b, c) != 1) {
              continue;
            }
          } else if (b != 0) {
            if (Functions.GCD.l(b, c) != 1) {
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
