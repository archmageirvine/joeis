package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002481 Numbers of form x^2 + 6y^2.
 * @author Sean A. Irvine
 */
public class A002481 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long q = 0, r; (r = mN - 6 * q * q) >= 0; ++q) {
        final long y = Functions.SQRT.l(r);
        if (y * y == r) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
