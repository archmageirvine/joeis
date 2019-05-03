package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001744 Numbers n such that every digit contains a loop <code>(version 2)</code>.
 * @author Sean A. Irvine
 */
public class A001744 implements Sequence {

  private long mN = -1;

  private boolean containsNonLoop(long n) {
    while (n != 0) {
      final long d = n % 10;
      if (d == 1 || d == 2 || d == 3 || d == 5 || d == 7) {
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
