package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064362 Numbers n such that no Lucas number is a multiple of n.
 * @author Sean A. Irvine
 */
public class A064362 extends Sequence1 {

  private long mN = 4;

  private boolean is(final long n) {
    long a = 1;
    long b = 3;
    do {
      final long t = (a + b) % n;
      if (t == 0) {
        return true;
      }
      a = b;
      b = t;
    } while (a != 2 || b != 1);
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (!is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
