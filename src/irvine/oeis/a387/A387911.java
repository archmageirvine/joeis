package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A387911 extends Sequence1 {

  private long mN = 10;

  private boolean is(final long n) {
    final String s = String.valueOf(n);
    for (int k = 1; k < s.length(); ++k) {
      if (Functions.DIGIT_SUM_ROOT.l(Long.parseLong(s.substring(0, k))) == Functions.DIGIT_SUM_ROOT.l(Long.parseLong(s.substring(k)))) {
        return true;
      }
    }
    return false;
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
