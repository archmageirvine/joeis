package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063527 Numbers that are divisible by all of their 1 and 2 digit substrings.
 * @author Sean A. Irvine
 */
public class A063527 extends Sequence1 {

  private long mN = 0;

  private boolean is(final String s, final long n) {
    if (s.contains("0")) {
      return false;
    }
    for (int k = 0; k < s.length(); ++k) {
      final int c = s.charAt(k) - '0';
      if (n % c != 0) {
        return false;
      }
      if (k < s.length() - 1) {
        final int d = c * 10 + s.charAt(k + 1) - '0';
        if (n % d != 0) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN < 10 || is(Long.toString(mN), mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
