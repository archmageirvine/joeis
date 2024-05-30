package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066955 Number of unordered solutions of x*y + y*z + z*x = n, x,y,z &gt; 0.
 * @author Sean A. Irvine
 */
public class A066955 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 1; x <= Functions.SQRT.l(mN / 3); ++x) {
      for (long y = x; y <= Functions.SQRT.l(x * x + mN) - x; ++y) {
        final long a = mN - x * y;
        final long d = x + y;
        if (a % d == 0) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
