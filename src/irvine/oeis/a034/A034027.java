package irvine.oeis.a034;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034027 Numbers of the form <code>x^2+2y^2</code> with <code>x &gt;= y &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A034027 implements Sequence {

  private long mN = -1;

  private boolean is(final long n) {
    long y = 0;
    while (true) {
      final long t = 2 * y * y;
      final long r = n - t;
      if (2 * r < t) {
        break;
      }
      final long s = LongUtils.sqrt(r);
      if (s * s == r) {
        return true;
      }
      ++y;
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
