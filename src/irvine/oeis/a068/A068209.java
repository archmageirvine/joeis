package irvine.oeis.a068;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a003.A003627;

/**
 * A068192.
 * @author Sean A. Irvine
 */
public class A068209 extends A003627 {

  private boolean is(final long p) {
    final long p2 = p * p;
    for (long k = 1; k <= p - 2; ++k) {
      if (LongUtils.modPow(k + 1, p, p2) - LongUtils.modPow(k, p, p2) == 1) {
        return true;
      }
    }
    return false;
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

