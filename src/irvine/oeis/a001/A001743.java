package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001743 Every digit contains at least one loop (version <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A001743 implements Sequence {

  private long mN = -1;

  private boolean containsNonLoop(long n) {
    while (n != 0) {
      final long d = n % 10;
      if ((d != 0 && d < 6) || d == 7) {
        return true;
      }
      n /= 10;
    }
    return false;
  }

  @Override
  public Z next() {
    while (containsNonLoop(++mN)) {
    }
    return Z.valueOf(mN);
  }
}
