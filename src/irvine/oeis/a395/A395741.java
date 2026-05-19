package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395741 a(n) is the smallest positive integer m such that m mod k &lt; k/2 for each 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A395741 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  private boolean is(final long m, final long n) {
    for (long k = 1; k <= n; ++k) {
      if (2 * (m % k) >= k) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mM, mN)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
