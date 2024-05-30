package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054402 Numbers that are the sum of a positive square and a positive cube in more than one way.
 * @author Sean A. Irvine
 */
public class A054402 extends Sequence1 {

  private long mN = 16;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      boolean seen = false;
      for (long j2, k = 1; (j2 = mN - k * k * k) > 0; ++k) {
        final long j = Functions.SQRT.l(j2);
        if (j * j == j2) {
          if (seen) {
            return Z.valueOf(mN);
          }
          seen = true;
        }
      }
    }
  }
}
