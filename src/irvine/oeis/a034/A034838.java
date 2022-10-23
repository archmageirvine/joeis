package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034838 Numbers k that are divisible by every digit of k.
 * @author Sean A. Irvine
 */
public class A034838 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final String s = String.valueOf(n);
    if (s.contains("0")) {
      return false;
    }
    for (int k = 0; k < s.length(); ++k) {
      if (n % (s.charAt(k) - '0') != 0) {
        return false;
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
