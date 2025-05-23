package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075989 Number of k satisfying 1&lt;=k&lt;=n and {n/k} &gt;= 1/2, where {n/k} is the fractional part of n/k, i.e., {n/k} = n/k - floor(n/k).
 * @author Sean A. Irvine
 */
public class A075989 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      final Q f = new Q(mN, k).frac();
      if (f.compareTo(Q.HALF) >= 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
