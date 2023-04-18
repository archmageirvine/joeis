package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A057535 Numbers expressible as (a^2 - 1)*(b^2 - 1) in 5 distinct ways.
 * @author Sean A. Irvine
 */
public class A057535 extends Sequence1 {

  private static final int MOD = 134217757;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeSet<Z> mProducts = new TreeSet<>();
  private final int[] mHashCounts = new int[MOD];
  private final int mTarget;
  private long mN = 1;

  protected A057535(final int target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A057535() {
    this(5);
  }

  private int getExactCount(final Z n) {
    int cnt = 0;
    for (final Z a : mProducts) {
      final Z[] qr = n.divideAndRemainder(a);
      if (qr[0].compareTo(a) < 0) {
        break;
      }
      if (qr[1].isZero() && mProducts.contains(qr[0])) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().subtract(1);
      mProducts.add(t);
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("n=" + mN);
      }
      for (long k = 2; k <= mN; ++k) {
        final Z s = t.multiply(k - 1).multiply(k + 1);
        final int hash = (int) s.mod(MOD);
        if (++mHashCounts[hash] >= mTarget && getExactCount(s) == mTarget) {
          mHashCounts[hash] -= mTarget;
          return s;
        }
      }
    }
  }
}
