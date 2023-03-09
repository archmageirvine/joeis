package irvine.oeis.a360;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A360382 Least integer m whose n-th power can be written as a sum of four distinct positive n-th powers.
 * @author Sean A. Irvine
 */
public class A360382 extends Sequence1 {

  private int mN = 0;
  private final ArrayList<Z> mPowers = new ArrayList<>();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private Z pow(final int k) {
    while (k >= mPowers.size()) {
      mPowers.add(Z.valueOf(mPowers.size()).pow(mN));
    }
    return mPowers.get(k);
  }

  private boolean is(final Z t, final int m, final int remaining) {
    if (remaining == 0) {
      return t.isZero();
    }
    for (int k = m - 1; k > 0; --k) {
      final Z kp = pow(k);
      if (kp.multiply(remaining).compareTo(t) < 0) {
        return false;
      }
      final Z u = t.subtract(kp);
      if (u.signum() >= 0 && is(u, k, remaining - 1)) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final int m) {
    if (mVerbose && m % 100 == 0) {
      StringUtils.message("n=" + mN + " trying: " + m);
    }
    return is(pow(m), m, 4);
  }

  @Override
  public Z next() {
    ++mN;
    mPowers.clear();
    int m = 0;
    while (true) {
      if (is(++m)) {
        return Z.valueOf(m);
      }
    }
  }
}
