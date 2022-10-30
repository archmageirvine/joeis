package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053998 Smallest prime in n-th shell of prime spiral.
 * @author Sean A. Irvine
 */
public class A053998 extends A000040 {

  {
    setOffset(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z p = super.next();
    for (long k = 1; k < Math.max(1, 8 * mN); ++k) {
      super.next();
    }
    return p;
  }
}

