package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A032735 Palindromes that cannot be prefixed or followed by any digit to form a prime.
 * @author Sean A. Irvine
 */
public class A032735 extends A002113 {

  private static final String[] PREFIXES = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
  private static final String[] SUFFIXES = {"1", "3", "7", "9"};

  private boolean is(final Z n) {
    for (final String prefix : PREFIXES) {
      for (final String suffix : SUFFIXES) {
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
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
