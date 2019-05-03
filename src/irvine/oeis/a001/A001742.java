package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001742 Numbers whose digits contain no loops (version <code>2)</code>.
 * @author Sean A. Irvine
 */
public class A001742 implements Sequence {

  private long mN = 0;

  private boolean containsLoop(long n) {
    while (n != 0) {
      final long d = n % 10;
      if (d == 0 || d == 4 || d == 6 || d >= 8) {
        return true;
      }
      n /= 10;
    }
    return false;
  }

  @Override
  public Z next() {
    while (containsLoop(++mN)) {
    }
    return Z.valueOf(mN);
  }
}
