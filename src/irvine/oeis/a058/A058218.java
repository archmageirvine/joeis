package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058218 Positive integers that cannot be represented in the form n=5|ab|+a+b for any choice of nonzero integers a and b (positive or negative).
 * @author Sean A. Irvine
 */
public class A058218 implements Sequence {

  private long mN = -1;

  private boolean is(final long n) {
    int c4 = 0;
    for (final Z dd : Jaguar.factor(5 * n - 1).divisors()) {
      final long d = dd.longValue();
      final long r = d % 5;
      if (r == 4 && ++c4 > 1) {
        return false;
      }
    }
    int c14 = 0;
    for (final Z dd : Jaguar.factor(5 * n + 1).divisors()) {
      final long d = dd.longValue();
      final long r = d % 5;
      if ((r == 1 || r == 4) && ++c14 > 2) {
        return false;
      }
    }
    return c14 == 2 && c4 == 1;
  }

  @Override
  public Z next() {
    if (mN < 0) {
      mN = 0;
      return Z.ONE; // only odd solution
    }
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

