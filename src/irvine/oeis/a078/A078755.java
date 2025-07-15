package irvine.oeis.a078;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a079.A079101;
import irvine.util.string.StringUtils;

/**
 * A078755 Values of n such that equal numbers of 0's and 1's occur in the first n terms of the repetition-resistant sequence A079101.
 * @author Sean A. Irvine
 */
public class A078755 extends A079101 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final long[] mCounts = new long[2];
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      ++mCounts[super.next().intValue()];
      if (mCounts[0] == mCounts[1]) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 100000 == 0) {
        StringUtils.message("Search completed to " + mN + " " + Arrays.toString(mCounts));
      }
    }
  }
}
