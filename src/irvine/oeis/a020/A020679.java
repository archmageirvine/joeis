package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020679 Numbers of form 3*x^2 + 7*y^2.
 * @author Sean A. Irvine
 */
public class A020679 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; 3 * s * s <= mN; ++s) {
        final long t = mN - 3 * s * s;
        if (t % 7 == 0) {
          final long u = t / 7;
          final long v = Functions.SQRT.l(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
