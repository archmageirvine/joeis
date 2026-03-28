package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393179 Number of k &lt;= 2^(n-1) such that tau(k) = n where tau = A000005.
 * @author Sean A. Irvine
 */
public class A393179 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long lim = 1L << mN;
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= lim; ++k) {
      if (Functions.SIGMA0.l(k) == mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
