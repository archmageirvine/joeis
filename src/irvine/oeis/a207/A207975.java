package irvine.oeis.a207;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A207975 Triangle where row n consists of a sequence of n positive integers g(1) &lt; g(2) &lt; ... &lt; g(n) with the minimal sum such that A001222(g(i)+g(j)) = A001222(g(i)) + A001222(g(j)) for all 1 &lt;= i &lt; j &lt;= n.
 * @author Sean A. Irvine
 */
public class A207975 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mM = 0;
  private long[] mA;
  private long[] mOmegas;
  protected long mBest;
  private long[] mB;

  private boolean isOk(final long m, final long omegaM, final int index) {
    for (int k = index - 1; k >= 0; --k) {
      final long v = mA[k];
      final long a = mOmegas[k];
      final long b = Functions.BIG_OMEGA.l(m + v);
      if (omegaM + a != b) {
        return false;
      }
    }
    return true;
  }

  private void search(final long sum, final long prev, final int index) {
    if (sum > mBest) {
      return;
    }
    if (index == mN) {
      mBest = sum;
      mB = Arrays.copyOf(mA, mA.length);
      return;
    }
    final int remaining = mN - index;
    for (long k = prev + 1; sum + k * remaining < mBest; ++k) {
      final long omega = Functions.BIG_OMEGA.l(k);
      if (isOk(k, omega, index)) {
        mA[index] = k;
        mOmegas[index] = omega;
        search(sum + k, k, index + 1);
      }
    }
  }

  protected void step() {
    mA = new long[++mN];
    mOmegas = new long[mN];
    mBest = Long.MAX_VALUE;
    search(0, 0, 0);
    if (mVerbose) {
      StringUtils.message(Arrays.toString(mB) + " Sum: " + mBest);
    }
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      step();
      mM = 0;
    }
    return Z.valueOf(mB[mM]);
  }
}
