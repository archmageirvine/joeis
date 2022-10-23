package irvine.oeis.a049;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049747 Array T read by diagonals; T(i,j)=number of directions from (0,0) to lattice points in first-quadrant portion of disk with radius (0,0)-to-(i,j).
 * @author Sean A. Irvine
 */
public class A049747 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  protected int t(final long n, final long m) {
    if (n == 0 && m == 0) {
      return 0;
    }
    if (m > n) {
      return t(m, n);
    }
    final long r2 = n * n + m * m;
    final HashSet<Q> slopes = new HashSet<>();
    for (long k = 0; k * k <= r2; ++k) {
      final long t = r2 - k * k;
      for (long j = 1; j * j <= t; ++j) {
        final Q slope = new Q(k, j);
        slopes.add(slope);
      }
    }
    return slopes.size() + 1; // + 1 for vertical
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
