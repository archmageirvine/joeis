package irvine.oeis.a072;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;
import irvine.util.array.DynamicIntArray;
import irvine.util.string.StringUtils;

/**
 * A072304 a(n)-th Fibonacci number is the smallest Fibonacci number containing exactly n 0's.
 * @author Sean A. Irvine
 */
public class A072304 extends Sequence1 {

  private static final long HEURISTIC = 100;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicIntArray mCounts = new DynamicIntArray();
  private final HashSet<Integer> mReportedAsZero = new HashSet<>(); // used to detect heuristic failures
  private final int mDigit;
  private int mN = 0;
  private int mC = 0;
  private final Sequence mFibonacci = new A000045().skip();

  protected A072304(final int digit) {
    mDigit = digit;
  }

  /** Construct the sequence. */
  public A072304() {
    this(0);
  }

  @Override
  public Z next() {
    ++mN;
    int m = 0;
    while (true) {
      ++m;
      if (m >= mC) {
        ++mC;
        final Z fibo = mFibonacci.next();
        final int cnt = ZUtils.digitCounts(fibo)[mDigit];
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
