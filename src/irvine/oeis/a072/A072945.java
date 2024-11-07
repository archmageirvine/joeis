package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072945 Number of pairs (x,y) with x,y &gt;= 0 such that x^3+y^2+x*y &lt;= n.
 * @author Sean A. Irvine
 */
public class A072945 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long x = -1;
    while (true) {
      final long x3 = ++x * x * x;
      if (x3 > mN) {
        return Z.valueOf(cnt);
      }
      long y = -1;
      while (true) {
        final long s = x3 + x * ++y + y * y;
        if (s > mN) {
          break;
        }
        ++cnt;
      }
    }
  }
}

