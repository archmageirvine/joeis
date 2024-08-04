package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071694 Number of ways to write n as n = x*y*z/(x+y+z) 1 &lt;= x &lt;= y &lt;= z &lt;= n.
 * @author Sean A. Irvine
 */
public class A071694 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 1; x <= mN; ++x) {
      for (long y = 1; y <= x; ++y) {
        for (long z = 1; z <= y; ++z) {
          if (x * y * z == mN * (x + y + z)) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
