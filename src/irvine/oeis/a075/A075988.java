package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075988 Number of integers k satisfying 1 &lt;= k &lt;= n and 0 &lt; frac(n/k) &lt; 1/2, where frac(n/k) is the fractional part of n/k; i.e., frac(n/k) = n/k - floor(n,k).
 * @author Sean A. Irvine
 */
public class A075988 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      final Q f = new Q(mN, k).frac();
      if (!f.isZero() && f.compareTo(Q.HALF) < 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
