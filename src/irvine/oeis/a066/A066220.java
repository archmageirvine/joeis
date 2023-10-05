package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066207.
 * @author Sean A. Irvine
 */
public class A066220 extends A000040 {

  private boolean is(final long p, final long k) {
    for (long t = p - 2; t > 1; --t) {
      if (LongUtils.modPow(t, k, p - t) != 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long k = 0;
    while (true) {
      if (is(p, ++k)) {
        return Z.valueOf(k);
      }
    }
  }
}
