package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001358;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.string.StringUtils;

/**
 * A395477 a(n) is the smallest semiprime that can be partitioned in exactly n unique ways into two coprime semiprimes.
 * @author Sean A. Irvine
 */
public class A395477 extends Sequence0 {

  private static final long REPORT_STEP = 100000;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Sequence mS = new A001358();
  private final LongDynamicBooleanArray mSemiprimesSet = new LongDynamicBooleanArray();
  private final DynamicLongArray mSemiprimes = new DynamicLongArray();
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = -1;
  private int mM = -1;
  private long mReport = REPORT_STEP;

  private long semi(final int m) {
    while (m >= mSemiprimes.length()) {
      final long s = mS.next().longValueExact();
      mSemiprimesSet.set(s);
      mSemiprimes.set(mSemiprimes.length(), s);
    }
    return mSemiprimes.get(m);
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long s = semi(++mM);
      if (mVerbose && s >= mReport) {
        StringUtils.message("Search completed to " + s);
        mReport += REPORT_STEP;
      }
      int cnt = 0;
      int m = 0;
      while (true) {
        final long t = semi(m++);
        if (2 * t >= s) {
          break;
        }
        final long u = s - t;
        if (mSemiprimesSet.isSet(u) && Functions.GCD.l(t, u) == 1) {
          ++cnt;
        }
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, s);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

