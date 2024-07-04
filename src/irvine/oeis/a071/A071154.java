package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a079.A079436;

/**
 * A071153.
 * @author Sean A. Irvine
 */
public class A071154 extends A079436 {

  private long mN = 0;

  private boolean is(final long n) {
    long s = 0;
    final String t = String.valueOf(n);
    for (int k = 0; k < t.length(); ++k) {
      s += t.charAt(k) - '0' - 1;
      if (s < 0) {
        return false;
      }
    }
    return s == 0;
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
