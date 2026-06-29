package irvine.oeis.a085;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085578 Array read by antidiagonals: T(m,n) is the number of distinct products ij with 1&lt;=i&lt;=m, i&lt;=j&lt;=n, for m&gt;=1, n&gt;=1.
 * @author Sean A. Irvine
 */
public class A085578 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private int t(final long n, final long m) {
    final HashSet<Long> p = new HashSet<>();
    for (long k = 1; k <= n; ++k) {
      for (long j = 1; j <= m; ++j) {
        p.add(k * j);
      }
    }
    return p.size();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mN - mM + 1, mM + 1));
  }
}
