package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071690 Number of ways to write n as n = x*y*z*t/(x+y+z+t) with 1 &lt;= x &lt;= y &lt;= z &lt;= t &lt;= n.
 * @author Sean A. Irvine
 */
public class A071690 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 1; x <= mN; ++x) {
      for (long y = 1; y <= x; ++y) {
        for (long z = 1; z <= y; ++z) {
          for (long t = 1; t <= z; ++t) {
            if (x * y * z * t == mN * (x + y + z + t)) {
              ++cnt;
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
