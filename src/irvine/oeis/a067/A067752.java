package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067752 Number of unordered solutions of xy + xz + yz = n in nonnegative integers.
 * @author Sean A. Irvine
 */
public class A067752 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 0; 3 * x * x <= mN; ++x) {
      for (long y = Math.max(1, x); (y + x) * (y + x) <= x * x + mN; ++y) {
        final long a = mN - x * y;
        final long b = x + y;
        if (a % b == 0) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
