package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049727 Array T read by diagonals; T(i,j)=number of lattice points in triangle (possibly degenerate) with vertices (0,0),(i,0),(i,j).
 * @author Sean A. Irvine
 */
public class A049727 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  protected long t(final long n, final long m) {
    if (n == 0) {
      return 1 + m;
    }
    long cnt = 0;
    for (long k = 0; k <= n; ++k) {
      cnt += 1 + k * m / n;
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
