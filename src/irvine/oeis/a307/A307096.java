package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307096.
 * @author Sean A. Irvine
 */
public class A307096 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      boolean ok = true;
      for (long mask = 3; ok && mask <= 2 * mN; mask = 2 * mask + 1) {
        if ((mN & mask) % 3 == 0) {
          ok = false;
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}
