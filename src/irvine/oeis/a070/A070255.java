package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070255 Numbers which divided into two substrings by breaking at any digit then one of them divides the other (0 is not to be considered a substring, multiples of 10 are excluded).
 * @author Sean A. Irvine
 */
public class A070255 extends Sequence1 {

  private long mN = 10;

  private boolean is(final long n) {
    if (n % 10 == 0) {
      return false;
    }
    final String s = String.valueOf(n);
    for (int k = 1; k < s.length(); ++k) {
      if (s.charAt(k) != '0') {
        final long a = Long.parseLong(s.substring(k));
        final long b = Long.parseLong(s.substring(0, k));
        if (a % b != 0 && b % a != 0) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
