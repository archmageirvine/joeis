package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048610 Smallest number that is the sum of two positive squares in &gt;= n ways.
 * @author Sean A. Irvine
 */
public class A048610 extends Sequence1 {

  private int mN = 0;
  private long mM = 0;
  private long mWays = 0;

  @Override
  public Z next() {
    ++mN;
    while (mWays < mN) {
      mWays = 0;
      ++mM;
      for (long i, j, k = 1; (j = mM - (i = k * k)) > 0 && i <= j; ++k) {
        final long s = Functions.SQRT.l(j);
        if (s * s == j) {
          ++mWays;
        }
      }
    }
    return Z.valueOf(mM);
  }
}

