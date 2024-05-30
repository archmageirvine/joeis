package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020688 Numbers of form 5 x^2 + 9 y^2.
 * @author Sean A. Irvine
 */
public class A020688 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; 5 * s * s <= mN; ++s) {
        final long t = mN - 5 * s * s;
        if (t % 9 == 0) {
          final long u = t / 9;
          final long v = Functions.SQRT.l(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
