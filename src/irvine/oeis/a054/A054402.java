package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054402 Numbers that are the sum of a positive square and a positive cube in more than one way.
 * @author Sean A. Irvine
 */
public class A054402 implements Sequence {

  private long mN = 16;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      boolean seen = false;
      for (long j2, k = 1; (j2 = mN - k * k * k) > 0; ++k) {
        final long j = LongUtils.sqrt(j2);
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
