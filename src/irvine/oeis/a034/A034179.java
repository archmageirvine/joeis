package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034179 Difference between two positive cubes in more than one way.
 * @author Sean A. Irvine
 */
public class A034179 extends Sequence1 {

  private long mN = 720;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long lim = Functions.SQRT.l(mN / 3) + 1;
      int c = 0;
      for (long x = Z.valueOf(mN).root(3).longValueExact(); x <= lim; ++x) {
        final long x3 = x * x * x;
        if (x3 > mN) {
          final Z y = Z.valueOf(x3 - mN);
          if (y.root(3).auxiliary() != 0 && ++c > 1) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

