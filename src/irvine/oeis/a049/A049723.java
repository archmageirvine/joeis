package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049723 Array T read by diagonals; T(i,j)=number of lattice points (x,y) in closed right half-plane and circle with radius (0,0)-to-(i,j).
 * @author Sean A. Irvine
 */
public class A049723 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  protected long t(final long n, final long m) {
    if (n == 0 && m == 0) {
      return 1;
    }
    if (m > n) {
      return t(m, n);
    }
    long cnt = 0;
    final long r2 = n * n + m * m;
    for (long k = 0; k * k <= r2; ++k) {
      final long t = r2 - k * k;
      cnt += (k == 0 ? 1 : 2) * (LongUtils.sqrt(t) + 1);
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
