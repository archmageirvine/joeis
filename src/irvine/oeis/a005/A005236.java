package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005236 Barriers for omega(n): numbers n such that, for all m &lt; n, m + omega(m) &lt;= n.
 * @author Sean A. Irvine
 */
public class A005236 implements Sequence {

  private long mN = 1;

  private boolean isBarrier(final long n) {
    for (long m = 1; m < n; ++m) {
      if (m + Cheetah.factor(m).omega() > n) {
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
