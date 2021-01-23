package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001745 Numbers such that at least one digit contains a loop (version 2). Also called "holey" or "holy" numbers.
 * @author Sean A. Irvine
 */
public class A001745 implements Sequence {

  private long mN = -1;

  private boolean containsLoop(long n) {
    do {
      final long d = n % 10;
      if (d == 0 || d == 4 || d == 6 || d == 8 || d == 9) {
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
