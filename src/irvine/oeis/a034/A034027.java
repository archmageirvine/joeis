package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034027 Numbers of the form x^2+2y^2 with x &gt;= y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A034027 extends Sequence1 {

  private long mN = -1;

  private boolean is(final long n) {
    long y = 0;
    while (true) {
      final long t = 2 * y * y;
      final long r = n - t;
      if (2 * r < t) {
        break;
      }
      final long s = Functions.SQRT.l(r);
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
