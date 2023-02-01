package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061276.
 * @author Sean A. Irvine
 */
public class A061276 extends Sequence1 {

  private long mN = -1;

  private boolean is(final long n, final long m, final long s) {
    if (s == n) {
      return m == 0;
    }
    if (m == 0) {
      return false;
    }
    final long q = m / 10;
    final long r = m % 10;
    if (r == 0) {
      return is(n, q, s);
    } else {
      for (long k = r; s + k <= n; k = 10 * k + r) {
        if (is(n, q, s + k)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN, mN, 0)) {
        return Z.valueOf(mN);
      }
    }
  }
}
