package irvine.oeis.a048;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048610 Smallest number that is the sum of two positive squares in &gt;= n ways.
 * @author Sean A. Irvine
 */
public class A048610 implements Sequence {

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
        final long s = LongUtils.sqrt(j);
        if (s * s == j) {
          ++mWays;
        }
      }
    }
    return Z.valueOf(mM);
  }
}

