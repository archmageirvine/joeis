package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084958 Initial prime of a prime chain of length n under the iteration x-&gt;5x+2.
 * @author Sean A. Irvine
 */
public class A084958 extends A000040 {

  private Z mP = super.next();
  private int mN = 0;

  private boolean is(final Z p, final int n) {
    Z q = p;
    for (int k = 1; k < n; ++k) {
      q = q.multiply(5).add(2);
      if (!q.isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mP, mN)) {
      mP = super.next();
    }
    return mP;
  }
}
