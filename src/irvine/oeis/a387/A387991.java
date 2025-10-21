package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387991 Number of ways to write n as i*prime(i) + j*prime(j) + k*prime(k) + m*prime(m) with 1 &lt;= i &lt;= j &lt;= k &lt;= m.
 * @author Sean A. Irvine
 */
public class A387991 extends Sequence1 {

  private long mN = 0;
  private long mCount = 0;

  private void search(final long n, final int cnt, final int k) {
    if (cnt <= 0) {
      if (n == 0) {
        ++mCount;
      }
      return;
    }
    int j = k;
    while (true) {
      final long t = Functions.PRIME.l(j) * j;
      if (cnt * t > n) {
        return;
      }
      search(n - t, cnt - 1, j);
      ++j;
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    search(mN, 4, 1);
    return Z.valueOf(mCount);
  }
}
