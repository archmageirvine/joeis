package irvine.oeis.a057;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057828 Number of perfect squares, k^2, where k^2 &lt;= n and gcd(k,n) = 1.
 * @author Sean A. Irvine
 */
public class A057828 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k * k <= mN; ++k) {
      if (LongUtils.gcd(k, mN) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
