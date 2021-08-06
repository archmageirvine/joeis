package irvine.oeis.a049;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049639 Array T read by diagonals; T(i,j) = number of lines passing through (i,j) and at least two other lattice points (h,k) satisfying 0&lt;=h&lt;=i, 0&lt;=k&lt;=j.
 * @author Sean A. Irvine
 */
public class A049639 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  protected int t(final long n, final long m) {
    if (n <= 1) {
      return m <= 1 ? 0 : 1;
    }
    if (m <= 1) {
      return 1;
    }
    final HashSet<Q> seen = new HashSet<>();
    final HashSet<Q> multipoint = new HashSet<>();
    for (long k = 0; k < n; ++k) {
      for (long j = 0; j < m; ++j) {
        final Q slope = new Q(n - k, m - j);
        if (!seen.add(slope)) {
          // i.e., we already saw this slope at least once
          multipoint.add(slope);
        }
      }
    }
    return multipoint.size() + 2; // +2 for horizontal and vertical
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
