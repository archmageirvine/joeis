package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396031.
 * @author Sean A. Irvine
 */
public class A395103 extends Sequence1 {

  private long mN = 21;

  private boolean is(final int cnt, final String s) {
    if (cnt == 0) {
      return s.isEmpty();
    }
    if (cnt > s.length() || s.charAt(0) == '0') {
      return false;
    }
    for (int k = 1; k <= s.length(); ++k) {
      if (new Z(s.substring(0, k)).isProbablePrime() && is(cnt - 1, s.substring(k))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final int cnt = Functions.BIG_OMEGA.i(++mN);
      if (cnt > 1 && is(cnt, String.valueOf(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
