package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024507 Numbers that are the sum of 2 distinct nonzero squares (with repetition).
 * @author Sean A. Irvine
 */
public class A024507 extends Sequence1 {

  private long mN = 4;
  private long mC = 0;

  @Override
  public Z next() {
    while (mC == 0) {
      ++mN;
      for (long x = 1; 2 * x * x < mN; ++x) {
        final long y2 = mN - x * x;
        final long y = Functions.SQRT.l(y2);
        if (y * y == y2) {
          ++mC;
        }
      }
    }
    --mC;
    return Z.valueOf(mN);
  }
}

