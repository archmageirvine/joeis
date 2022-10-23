package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057948 S-primes: let S = {1,5,9, ... 4i+1, ...}; then an S-prime is in S but is not divisible by any members of S except itself and 1.
 * @author Sean A. Irvine
 */
public class A057948 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      if (d > 1 && d < n && (d & 3) == 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
