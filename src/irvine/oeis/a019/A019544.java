package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019544.
 * @author Sean A. Irvine
 */
public class A019544 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      Z t = s;
      boolean ok = true;
      while (!Z.ZERO.equals(t)) {
        final long r = t.mod(10);
        if (r != 0 && r != 1 && r != 4 && r != 9) {
          ok = false;
          break;
        }
        t = t.divide(10);
      }
      if (ok) {
        return s;
      }
    }
  }
}
