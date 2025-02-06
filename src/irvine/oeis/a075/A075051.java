package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A075051 extends A000040 {

  private int mN = 0;
  private Z mP = super.next();

  private boolean is(final Z p, final int n) {
    final long d = mPrime.nextPrime(p).subtract(p).longValueExact();
    Z q = p;
    for (int k = 0; k < n; ++k) {
      q = mPrime.prevPrime(q);
    }
    return p.subtract(q).longValue() < d;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(mP, mN)) {
        return mP;
      }
      mP = super.next();
    }
  }
}
