package irvine.oeis.a378;

import java.util.Arrays;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.util.string.StringUtils;

/**
 * A073546 Triangle read by rows: row n gives denominators of n distinct unit fractions (or Egyptian fractions) summing to 1, where denominators are listed in increasing order and the largest denominator is smallest possible.
 * @author Sean A. Irvine
 */
public class A378723 extends Sequence3 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mM = 2;
  private long[] mV = new long[2];

  private boolean isBetter(final long[] soFar) {
    for (int k = soFar.length - 1; k >= 0; --k) {
      if (soFar[k] < mV[k]) {
        return true;
      }
      if (soFar[k] > mV[k]) {
        return false;
      }
    }
    return false;
  }

  private void search(final long[] soFar, final int pos, final Q remaining) {
    long k = pos == 0 ? 1 : soFar[pos - 1];
    if (k > mV[mV.length - 1]) {
      return;
    }
    if (pos == soFar.length - 1) {
      if (remaining.num().equals(Z.ONE)) {
        final Z t = remaining.den();
        if (t.bitLength() < Long.SIZE) {
          final long u = t.longValue();
          if (u <= mV[mV.length - 1] && u > k) {
            soFar[pos] = u;
            if (isBetter(soFar)) {
              mV = Arrays.copyOf(soFar, soFar.length);
              if (mVerbose) {
                StringUtils.message(mV.length + " New best: " + Arrays.toString(mV));
              }
            }
          }
        }
      }
      return;
    }
    while (++k <= mV[mV.length - 1] - (mV.length - pos)) {
      final Q r = remaining.subtract(new Q(1, k));
      if (r.signum() >= 0) {
        soFar[pos] = k;
        search(soFar, pos + 1, r);
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mV.length) {
      mV = new long[mV.length + 1];
      // Upper bound on the solution. If we fail to find a solution better than this
      // then we will throw an exception. If that ever happens then this limit
      // could be made larger.
      final long lim = 3L * mV.length + 1;
      mV[mV.length - 1] = lim;
      mM = 0;
      search(new long[mV.length], 0, Q.ONE);
      if (mV[mV.length - 1] == lim) {
        throw new UnsupportedOperationException();
      }
    }
    return Z.valueOf(mV[mM]);
  }
}
