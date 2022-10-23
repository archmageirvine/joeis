package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001743 Numbers in which every digit contains at least one loop (version 1).
 * @author Sean A. Irvine
 */
public class A001743 extends Sequence1 {

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
