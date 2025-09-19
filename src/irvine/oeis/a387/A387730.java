package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A387730 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A387730 extends Sequence1 {

  // Too slow ...

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;
  private CR mMin = CR.ONE;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSum = mSum.add(CR.valueOf(2 * mN + 1).sin().pow(2 * mN + 1));
      if (mSum.compareTo(mMin) < 0) {
        mMin = mSum;
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("Search completed to n=" + mN);
      }
    }
  }
}
