package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019545.
 * @author Sean A. Irvine
 */
public class A019545 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z cube = Z.valueOf(++mN).pow(3);
      Z t = cube;
      boolean ok = true;
      while (!Z.ZERO.equals(t)) {
        final long r = t.mod(10);
        if (r != 0 && r != 1 && r != 8) {
          ok = false;
          break;
        }
        t = t.divide(10);
      }
      if (ok) {
        return cube;
      }
    }
  }
}
