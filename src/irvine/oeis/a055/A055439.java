package irvine.oeis.a055;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055439 Distribution of first digit of mantissa following Benford's Law, using Sainte-Lague method to minimize chi-squared statistic.
 * @author Sean A. Irvine
 */
public class A055439 implements Sequence {

  private final int mBase;
  private final CR[] mLogs;
  private final long[] mCounts = new long[10];
  private int mN = 0;

  protected A055439(final int base) {
    mBase = base;
    final CR logBase = CR.valueOf(base).log();
    mLogs = new CR[base];
    for (int d = 1; d < base; ++d) {
      mLogs[d] = CR.valueOf(new Q(d + 1, d)).log().divide(logBase);
    }
  }

  /** Construct the sequence. */
  public A055439() {
    this(10);
  }

  private CR expected(final long n, final int d) {
    return mLogs[d].multiply(n);
  }

  private CR chi(final long n, final long[] observed) {
    CR sum = CR.ZERO;
    for (int d = 1; d < mBase; ++d) {
      final CR e = expected(n, d);
      sum = sum.add(CR.valueOf(observed[d]).subtract(e).pow(2).divide(e));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    int best = -1;
    CR bestScore = CR.TEN;
    for (int d = 1; d < mBase; ++d) {
      ++mCounts[d];
      final CR chi = chi(mN, mCounts);
      if (chi.compareTo(bestScore) < 0) {
        bestScore = chi;
        best = d;
      }
      --mCounts[d];
    }
    ++mCounts[best];
    return Z.valueOf(best);
  }
}
