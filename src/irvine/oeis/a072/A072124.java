package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;
import irvine.util.string.StringUtils;

/**
 * A072124 a(n)-th factorial is the smallest factorial containing exactly n 1's, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A072124 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicIntArray mCounts = new DynamicIntArray();
  private int mN = 0;
  private int mC = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    int m = 0;
    while (true) {
      ++m;
      if (m >= mC) {
        mF = mF.multiply(++mC);
        mCounts.set(mC, ZUtils.digitCounts(mF)[1]);
        if (mVerbose && mC % 1000 == 0) {
          StringUtils.message("Counts completed to " + mC + "!");
        }
      }
      if (mCounts.get(m) == mN) {
        return Z.valueOf(m);
      }
    }
  }
}
