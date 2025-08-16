package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067753 Number of primitive solutions in nonnegative integers of x*y+x*z+y*z = n.
 * @author Sean A. Irvine
 */
public class A067753 extends Sequence1 {

  private long mN = 0;

  private long f(final long x, final long y, final long z) {
    if (x == y) {
      if (x == z) {
        return 1;
      }
      return 3;
    }
    return x == z || y == z ? 3 : 6;
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 0; 3 * x * x <= mN; ++x) {
      for (long y = Math.max(1, x); (y + x) * (y + x) <= x * x + mN; ++y) {
        final long a = mN - x * y;
        final long b = x + y;
        if (a % b == 0) {
          final long z = a / b;
          if (Functions.GCD.l(x, y, z) == 1) {
            cnt += f(x, y, z);
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
