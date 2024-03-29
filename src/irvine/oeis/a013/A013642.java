package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013642 Numbers k such that the continued fraction for sqrt(k) has period 2.
 * @author Sean A. Irvine
 */
public class A013642 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long a = 1, a2 = 1; a2 < mN - 1; ++a, a2 = a * a) {
        final long b = mN - a2;
        if ((2 * a) % b == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
