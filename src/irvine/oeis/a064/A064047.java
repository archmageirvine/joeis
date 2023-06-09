package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064047 Number of numbers only appearing once in 1-to-n multiplication table.
 * @author Sean A. Irvine
 */
public class A064047 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long k, final long n) {
    for (final Z dd : Jaguar.factor(k * k).divisorsSorted()) {
      final long d = dd.longValue();
      if (d > k && d <= n) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (is(k, mN)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
