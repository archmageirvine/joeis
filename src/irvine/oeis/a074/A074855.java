package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A074855 Primes p such that all p-t for p/2 &lt; t &lt; p are nonprime, where t is a triangular number.
 * @author Sean A. Irvine
 */
public class A074855 extends A000040 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  private boolean is(final Z p) {
    long ti = Functions.TRINV.l(p);
    while (true) {
      final Z t = Functions.TRIANGULAR.z(ti);
      if (t.multiply2().compareTo(p) <= 0) {
        return true;
      }
      if (p.subtract(t).isProbablePrime()) {
        return false;
      }
      --ti;
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
