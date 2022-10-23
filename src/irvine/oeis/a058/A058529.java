package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058529 Numbers whose prime factors are all congruent to +1 or -1 modulo 8.
 * @author Sean A. Irvine
 */
public class A058529 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    for (final Z d : Jaguar.factor(n).divisors()) {
      final long r = d.mod(8);
      if (r != 1 && r != 7) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
