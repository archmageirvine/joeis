package irvine.oeis.a022;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022549 Sum of a square and a nonnegative cube.
 * @author Sean A. Irvine
 */
public class A022549 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long x2;
      for (long y = 0; (x2 = mN - y * y * y) >= 0; ++y) {
        final long x = Functions.SQRT.l(x2);
        if (x * x == x2) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

