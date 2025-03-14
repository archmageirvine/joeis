package irvine.oeis.a216;

import java.util.Arrays;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A216993 Triangle read by rows in which row n gives the lexicographically earliest denominators with the least possible maximum value among all n-term Egyptian fractions with unit sum.
 * @author Sean A. Irvine
 */
public class A216993 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mM = 0;
  private long[] mV = new long[0];

  private void search(final long[] soFar, final int pos, final Q remaining) {
    long k = pos == 0 ? 1 : soFar[pos - 1];
    if (k >= mV[mV.length - 1]) {
      return;
    }
    if (pos == soFar.length - 1) {
      if (remaining.num().equals(Z.ONE)) {
        final Z t = remaining.den();
        if (t.bitLength() < Long.SIZE) {
          final long u = t.longValue();
          if (u < mV[mV.length - 1] && u > k) {
            soFar[pos] = u;
            mV = Arrays.copyOf(soFar, soFar.length);
            if (mVerbose) {
              StringUtils.message(mV.length + " New best: " + Arrays.toString(mV));
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
      mM = 0;
      if (mV.length == 1) {
        mV[0] = 1;
      } else if (mV.length > 2) {
        // Upper bound on the solution. If we fail to find a solution better than this
        // then we will throw an exception. If that ever happens then this limit
        // could be made larger.
        final long lim = 3L * mV.length + 1;
        mV[mV.length - 1] = lim;
        search(new long[mV.length], 0, Q.ONE);
        if (mV[mV.length - 1] == lim) {
          throw new UnsupportedOperationException();
        }
      }
    }
    return Z.valueOf(mV[mM]);
  }
}
