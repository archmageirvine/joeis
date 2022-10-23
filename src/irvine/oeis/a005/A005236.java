package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005236 Barriers for omega(n): numbers n such that, for all m &lt; n, m + omega(m) &lt;= n.
 * @author Sean A. Irvine
 */
public class A005236 extends Sequence1 {

  private long mN = 1;

  private boolean isBarrier(final long n) {
    for (long m = 1; m < n; ++m) {
      if (m + Jaguar.factor(m).omega() > n) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (isBarrier(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
