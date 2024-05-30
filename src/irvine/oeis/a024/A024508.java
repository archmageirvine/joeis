package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024508 Numbers that are a sum of 2 distinct nonzero squares in more than one way.
 * @author Sean A. Irvine
 */
public class A024508 extends Sequence1 {

  private long mN = 64;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int cnt = 0;
      for (long x = 1; 2 * x * x < mN; ++x) {
        final long y2 = mN - x * x;
        final long y = Functions.SQRT.l(y2);
        if (y * y == y2 && ++cnt > 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

