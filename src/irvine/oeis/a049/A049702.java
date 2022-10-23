package irvine.oeis.a049;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049702 Array T read by diagonals; T(i,j)=number of directions determined by 2 lattice points in [ 0,i ]x[ 0,j ].
 * @author Sean A. Irvine
 */
public class A049702 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  protected int t(final long n, final long m) {
    if (n == 0) {
      return m == 0 ? 0 : 1;
    }
    if (m == 0) {
      return 1;
    }
    final HashSet<Q> slopes = new HashSet<>();
    for (long k = 0; k <= n; ++k) {
      for (long j = 0; j <= m; ++j) {
        for (long s = k; s <= n; ++s) {
          for (long t = j + 1; t <= m; ++t) {
            final Q slope = new Q(s - k, t - j);
            slopes.add(slope);
            slopes.add(slope.negate());
          }
        }
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
