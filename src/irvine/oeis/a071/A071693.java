package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071693 Number of ways to write n as n = x*y*z + x + y + z where 0 &lt;= x &lt;= y &lt;= z &lt;= n.
 * @author Sean A. Irvine
 */
public class A071693 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 0; x <= mN; ++x) {
      for (long y = x; y <= mN && x * y <= mN; ++y) {
        for (long z = y; z <= mN && x * y * z <= mN; ++z) {
          if (x * y * z + x + y + z == mN) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
