package irvine.oeis.a037;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037942 Numbers of the form x^2 + y^2 with x &gt;= 0, y &gt;= 0, gcd(x,y)=1, with multiplicity.
 * @author Sean A. Irvine
 */
public class A037942 implements Sequence {

  private long mN = 0;
  private long mCount = 0;

  private long count(final long n) {
    long cnt = 0;
    for (long x = 0; x * x <= n; ++x) {
      final long y2 = n - x * x;
      if (y2 < x * x) {
        break;
      }
      final long y = LongUtils.sqrt(y2);
      if (y * y == y2 && LongUtils.gcd(x, y) == 1) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    while (mCount == 0) {
      mCount = count(++mN);
    }
    --mCount;
    return Z.valueOf(mN);
  }
}


