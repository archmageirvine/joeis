package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063665 Number of ways 1/n can be written as 1/x^2 + 1/y^2 with y &gt;= x &gt;= 1.
 * @author Sean A. Irvine
 */
public class A063665 extends Sequence1 {

  // After Antti Karttunen

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = Functions.SQRT.l(mN); x <= mN; ++x) {
      final long x2 = x * x;
      if (x2 > mN) {
        final long t = mN * x2;
        if (t % (x2 - mN) == 0) {
          final long y2 = t / (x2 - mN);
          final long y = Functions.SQRT.l(y2);
          if (y * y == y2 && y >= x) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
