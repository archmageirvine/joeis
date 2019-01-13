package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002796.
 * @author Sean A. Irvine
 */
public class A002796 implements Sequence {

  private long mN = 0;
  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      boolean ok = true;
      while (m != 0) {
        final long d = m % 10;
        if (d > 1 && mN % d != 0) {
          ok = false;
          break;
        }
        m /= 10;
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}
