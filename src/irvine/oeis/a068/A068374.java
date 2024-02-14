package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061398.
 * @author Sean A. Irvine
 */
public class A068374 extends A000040 {

  private final Fast mFast = new Fast();

  private boolean is(final long n) {
    for (int k = 1; A068372.PRIMORIALS[k] < n; ++k) {
      if (!mFast.isPrime(n - A068372.PRIMORIALS[k])) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p.longValueExact())) {
        return p;
      }
    }
  }
}
