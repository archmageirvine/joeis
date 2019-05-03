package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001746 At least one digit contains a loop (version <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A001746 implements Sequence {

  private long mN = -1;

  private boolean containsLoop(long n) {
    do {
      final long d = n % 10;
      if (d == 0 || d == 6 || d == 8 || d == 9) {
        return true;
      }
      n /= 10;
    } while (n != 0);
    return false;
  }

  @Override
  public Z next() {
    while (!containsLoop(++mN)) {
    }
    return Z.valueOf(mN);
  }
}
