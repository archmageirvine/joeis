package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066958 Number of ordered primitive solutions (x,y,z) to xy + yz + zx = n with x,y,z &gt;= 1.
 * @author Sean A. Irvine
 */
public class A066958 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 1; x < mN; ++x) {
      for (long y = x; y < mN; ++y) {
        final long t = mN - x * y;
        if (t % (y + x) == 0) {
          final long z = t / (y + x);
          if (z >= 1 && LongUtils.gcd(x, y, z) == 1) {
            cnt += x == y ? 1 : 2;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
