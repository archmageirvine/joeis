package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A074856 Primes p such that all p-k^2 for p/2 &lt; k^2 &lt; p are nonprime.
 * @author Sean A. Irvine
 */
public class A074856 extends A000040 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  private boolean is(final Z p) {
    Z k = p.sqrt();
    while (true) {
      final Z k2 = k.square();
      if (k2.multiply2().compareTo(p) <= 0) {
        return true;
      }
      if (p.subtract(k2).isProbablePrime()) {
        return false;
      }
      k = k.subtract(1);
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
      if (mVerbose && ++mN % 1000000 == 0) {
        StringUtils.message("Search completed to " + p);
      }
    }
  }
}
