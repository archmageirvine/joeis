package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A065104 Numbers k such that for no m between k^2 and (k+1)^2 - 1 is it true that A003285(m) = A003285(m+1).
 * @author Sean A. Irvine
 */
public class A065104 extends A003285 {

  private long mN = 0;

  private boolean is(final long n) {
    Z t = period(Z.valueOf(n * n));
    for (long m = n * n; m < (n + 1) * (n + 1); ++m) {
      final Z u = period(Z.valueOf(m + 1));
      if (u.equals(t)) {
        return false;
      }
      t = u;
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
