package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002796 Numbers that are divisible by each nonzero digit.
 * @author Sean A. Irvine
 */
public class A002796 extends Sequence1 {

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
