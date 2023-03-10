package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061849.
 * @author Sean A. Irvine
 */
public class A061850 extends Sequence0 {

  private long mN = -1;

  private boolean is(final String str) {
    for (int k = 0; k < str.length(); ++k) {
      if (Math.abs(str.charAt(k) - str.charAt((k + 1) % str.length())) > 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      if (is(s.toString())) {
        return s;
      }
    }
  }
}
