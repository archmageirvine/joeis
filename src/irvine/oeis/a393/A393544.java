package irvine.oeis.a393;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A393544 The first of exactly n consecutive even numbers that are totient numbers (A002202).
 * @author Sean A. Irvine
 */
public class A393544 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mM += 2;
      while (InverseEuler.inversePhi(mM).isEmpty()) {
        mM += 2;
      }
      int cnt = 1;
      mM += 2;
      while (!InverseEuler.inversePhi(mM).isEmpty()) {
        mM += 2;
        ++cnt;
      }
      if (mFirsts.get(cnt) == 0) {
        final long start = mM - 2L * cnt;
        mFirsts.set(cnt, start);
        if (mVerbose) {
          StringUtils.message("Solution for " + cnt + " is " + start);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

