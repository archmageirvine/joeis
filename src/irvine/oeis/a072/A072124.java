package irvine.oeis.a072;

import java.util.HashSet;

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

  private static final long HEURISTIC = 20;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicIntArray mCounts = new DynamicIntArray();
  private final HashSet<Integer> mReportedAsZero = new HashSet<>(); // used to detect heuristic failures
  private final int mDigit;
  private int mN = 0;
  private int mC = 0;
  private Z mF = Z.ONE;

  protected A072124(final int digit) {
    mDigit = digit;
  }

  /** Construct the sequence. */
  public A072124() {
    this(1);
  }

  @Override
  public Z next() {
    ++mN;
    int m = 0;
    while (true) {
      ++m;
      if (m >= mC) {
        mF = mF.multiply(++mC);
        final int cnt = ZUtils.digitCounts(mF)[mDigit];
        mCounts.set(mC, cnt);
        if (mReportedAsZero.contains(cnt)) {
          throw new RuntimeException("Heuristic failed: " + cnt + " previously reported at 0 should be " + mC);
        }
        if (mVerbose && mC % 1000 == 0) {
          StringUtils.message("Counts completed to " + mC + "!");
        }
      }
      if (mCounts.get(m) == mN) {
        return Z.valueOf(m);
      }
      if (m > HEURISTIC * mN) {
        mReportedAsZero.add(mN);
        return Z.ZERO;
      }
    }
  }
}
