package irvine.oeis.a057;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057475 Number of k, 1 &lt;= k &lt;= n, such that gcd(n,k) = gcd(n+1,k) = 1.
 * @author Sean A. Irvine
 */
public class A057475 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (LongUtils.gcd(mN, k) == 1 && LongUtils.gcd(mN + 1, k) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
