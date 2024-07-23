package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A070297 Smallest number with n unrelated numbers (numbers which are neither coprime nor a divisor), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A070297 extends Sequence0 {

  // This heuristic is at least as strong as that specified in the OEIS
  private static final long HEURISTIC = 100;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = -1;
  private long mM = 2;

  @Override
  public Z next() {
    ++mN;
    while ((mN + 1) * HEURISTIC > mM && mFirsts.get(mN) == 0) {
      ++mM;
      int cnt = 0;
      for (long k = 2; k < mM; ++k) {
        if (mM % k != 0 && Functions.GCD.l(k, mM) > 1) {
          ++cnt;
        }
      }
      if (mFirsts.get(cnt) == 0) {
        if (cnt < mN) {
          throw new RuntimeException("Previously reported 0 for " + cnt + " was incorrect, result is " + mM);
        }
        mFirsts.set(cnt, mM);
      }
      if (mVerbose && mM % 100000 == 0) {
        StringUtils.message("Search completed to " + mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
