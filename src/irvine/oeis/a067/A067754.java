package irvine.oeis.a067;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067754 Number of unordered primitive solutions to xy+xz+yz=n.
 * @author Sean A. Irvine
 */
public class A067754 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 0; 3 * x * x <= mN; ++x) {
      for (long y = Math.max(1, x); (y + x) * (y + x) <= x * x + mN; ++y) {
        final long a = mN - x * y;
        final long b = x + y;
        if (a % b == 0 && LongUtils.gcd(x, y, a / b) == 1) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
