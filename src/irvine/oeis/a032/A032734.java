package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032734 All 81 combinations of prefixing and following <code>a(n)</code> by a single digit are nonprime.
 * @author Sean A. Irvine
 */
public class A032734 implements Sequence {

  private static final String[] PREFIXES = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
  private static final String[] SUFFIXES = {"1", "3", "7", "9"};
  private long mN = 2436;

  protected String[] prefixes() {
    return PREFIXES;
  }

  protected String[] suffixes() {
    return SUFFIXES;
  }

  private boolean isVeryComposite(final long n) {
    for (final String prefix : prefixes()) {
      for (final String suffix : suffixes()) {
        if (new Z(prefix + n + suffix).isProbablePrime()) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (isVeryComposite(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
