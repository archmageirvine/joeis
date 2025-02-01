package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002113;
import irvine.util.string.StringUtils;

/**
 * A074851.
 * @author Sean A. Irvine
 */
public class A074857 extends A000040 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  private boolean is(final Z p) {
    final Sequence palin = new A002113();
    while (true) {
      final Z pd = palin.next();
      if (pd.compareTo(p) >= 0) {
        return true;
      }
      if (pd.multiply2().compareTo(p) > 0 && p.subtract(pd).isProbablePrime()) {
        return false;
      }
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
