package irvine.oeis.a237;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A237591 Irregular triangle read by rows: T(n,k) is the difference between the total number of partitions of all positive integers &lt;= n into exactly k consecutive parts, and the total number of partitions of all positive integers &lt;= n into exactly k+1 consecutive parts (n&gt;=1, 1&lt;=k&lt;=A003056(n)).
 * @author Sean A. Irvine
 */
public class A237591 extends Sequence1 {

  private long mN = 1;
  private long mM = -1;
  private long mR = 1;
  private long mS = 1;

  // ceiling((n+1)/k - (k+1)/2) - ceiling((n+1)/(k+1) - (k+2)/2)
  protected long t(final long n, final long m) {
    final long u = (2 * (n + 1) - m * (m + 1) + 2 * m - 1) / (2 * m);
    final long v = (2 * (n + 1) - (m + 2) * (m + 1) + 2 * m) / (2 * (m + 1));
    return u - v;
  }

  @Override
  public Z next() {
    if (++mM >= mR) {
      if (--mS < 0) {
        mS = ++mR;
      }
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mN, mM + 1));
  }
}
