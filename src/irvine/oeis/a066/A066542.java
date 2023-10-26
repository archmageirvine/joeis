package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A100960.
 * @author Sean A. Irvine
 */
public class A066542 extends A000040 {

  private long mN = 2;

  private boolean is(final long n) {
    for (final long d : A066452.antidivisors(n)) {
      if ((d & 1) == 0 && d != 2) {
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
