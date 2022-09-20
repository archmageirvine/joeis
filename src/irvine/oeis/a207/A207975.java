package irvine.oeis.a207;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A207975.
 * @author Sean A. Irvine
 */
public class A207975 implements Sequence {

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
      final long b = Jaguar.factor(m + v).bigOmega();
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
      final long omega = Jaguar.factor(k).bigOmega();
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
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      step();
      mM = 0;
      if (mVerbose) {
        StringUtils.message(Arrays.toString(mB) + " Sum: " + mBest);
      }
    }
    return Z.valueOf(mB[mM]);
  }
}
