package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049695 Array T read by diagonals; T(i,j) is the number of nonnegative slopes of lines determined by 2 lattice points in [ 0,i ] X [ 0,j ] if i &gt; 0; T(0,j)=1 if j &gt; 0; T(0,0)=0.
 * @author Sean A. Irvine
 */
public class A049695 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  protected long t(final long n, final long m) {
    if (n == 0) {
      return m == 0 ? 0 : 1;
    }
    long cnt = 1;
    for (long k = 1; k <= n; ++k) {
      for (long j = 1; j <= m; ++j) {
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
