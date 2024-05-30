package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020692 Numbers of form 7 x^2 + 10 y^2.
 * @author Sean A. Irvine
 */
public class A020692 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; 7 * s * s <= mN; ++s) {
        final long t = mN - 7 * s * s;
        if (t % 10 == 0) {
          final long u = t / 10;
          final long v = Functions.SQRT.l(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
