package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A307096 Positive integers m such that for any positive integer k the last k bits of the binary expansion of m is not a multiple of 3.
 * @author Sean A. Irvine
 */
public class A307096 extends Sequence1 {

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
