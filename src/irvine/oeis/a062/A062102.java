package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062102 Numbers n such that no substring is a triangular number.
 * @author Sean A. Irvine
 */
public class A062102 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    final String s = Long.toString(n);
    for (long j, k = 4; (j = k * (k + 1) / 2) <= n; ++k) {
      if (s.contains(Long.toString(j))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if ((Functions.SYNDROME.i(++mN) & 0b0001001011) == 0 && is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
