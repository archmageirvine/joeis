package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049615 Array T by antidiagonals; T(i,j) = number of lattice points (x,y) hidden from (i,j), where 0&lt;=x&lt;=i, 0&lt;=y&lt;=j; (x,y) is hidden if there is a lattice point (h,k) collinear with and between (x,y) and (i,j).
 * @author Sean A. Irvine
 */
public class A049615 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  protected long t(final long n, final long m) {
    long cnt = 0;
    for (long k = 0; k <= n; ++k) {
      for (long j = 0; j <= m; ++j) {
        if (LongUtils.gcd(k, j) > 1) {
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
