package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A083191.
 * @author Sean A. Irvine
 */
public class A391118 extends Sequence3 {

  private long mN = 2;

  private boolean is(final long k, final long n) {
    for (final Z dd : Jaguar.factor(k).divisors()) {
      final long d = dd.longValue();
      if (d > n && d < 2 * n) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long prev = 0;
    long max = 0;
    for (long k = mN; k <= mN * mN; ++k) {
      if (is(k, mN)) {
        if (prev != 0 && k - prev > max) {
          max = k - prev;
        }
        prev = k;
      }
    }
    return Z.valueOf(max);
  }
}
