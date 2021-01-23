package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034838 Numbers n that are divisible by every digit of n.
 * @author Sean A. Irvine
 */
public class A034838 implements Sequence {

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
