package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A075652 Triangle read by rows in which the n-th row is an arithmetic progression of n terms with a common difference of n, and the first term is chosen the lowest possible so that no number appears twice.
 * @author Sean A. Irvine
 */
public class A075652 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long[] mA = {};
  private int mM = 0;
  private long mS = 1;

  private boolean ok(final long s, final long n) {
    if (mUsed.isSet(s)) {
      return false;
    }
    long t = s;
    for (int k = 1; k < n; ++k) {
      t += n;
      if (mUsed.isSet(t)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mM >= mA.length) {
      mA = new long[mA.length + 1];
      final int n = mA.length;
      mM = 0;
      long k = mS;
      while (!ok(k, n)) {
        ++k;
      }
      for (int j = 0; j < n; ++j) {
        mA[j] = k;
        mUsed.set(k);
        k += n;
      }
      while (mUsed.isSet(mS)) {
        ++mS;
      }
    }
    return Z.valueOf(mA[mM]);
  }
}
