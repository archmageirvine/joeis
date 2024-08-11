package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a079.A079436;

/**
 * A071154 Totally balanced decimal numbers: if we assign the weight w(d) = d-1 to each digit d (i.e., w(0) = -1, w(1) = 0, ..., w(9) = 8) and then read the digits of the term from left to right, the partial sum of the weights is never negative and the total weighted sum is zero.
 * @author Sean A. Irvine
 */
public class A071154 extends A079436 {

  {
    setOffset(0);
  }

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
