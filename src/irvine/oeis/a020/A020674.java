package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020674 Numbers of the form 2*x^2 + 5*y^2.
 * @author Sean A. Irvine
 */
public class A020674 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; 2 * s * s <= mN; ++s) {
        final long t = mN - 2 * s * s;
        if (t % 5 == 0) {
          final long u = t / 5;
          final long v = Functions.SQRT.l(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
