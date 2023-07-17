package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064544 Biquanimous numbers (or biquams): group the digits into two pieces (not necessarily equal or in order) with the same sum.
 * @author Sean A. Irvine
 */
public class A064544 extends Sequence0 {

  private long mN = -1;

  private boolean is(final long n, final long a, final long b) {
    if (n == 0) {
      return a == b;
    }
    return is(n / 10, a + n % 10, b) || is(n / 10, a, b + n % 10);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN, 0, 0)) {
        return Z.valueOf(mN);
      }
    }
  }
}

