package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049687 Array T read by diagonals: T(i,j)=number of lines passing through (0,0) and at least one other lattice point (h,k) satisfying 0&lt;=h&lt;=i, 0&lt;=k&lt;=j.
 * @author Sean A. Irvine
 */
public class A049687 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  protected long t(final long n, final long m) {
    long cnt = 0;
    for (long k = 0; k <= n; ++k) {
      for (long j = 0; j <= m; ++j) {
        if (LongUtils.gcd(k, j) == 1) {
          ++cnt;
        }
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mN - mM, mM));
  }
}
