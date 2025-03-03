package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A075647 List of groups in A075643.
 * @author Sean A. Irvine
 */
public class A075647 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long[] mA = {2};
  private int mM = -1;
  private long mS = 1;
  {
    mUsed.set(2);
  }

  @Override
  public Z next() {
    if (++mM >= mA.length) {
      mA = new long[mA.length + 1];
      final int n = mA.length;
      mM = 0;
      long sum = 0;
      for (int j = 1; j < n; ++j) {
        long k = ((mS + j - 1) / j) * j;
        while (mUsed.isSet(k)) {
          k += j;
        }
        sum += k;
        mUsed.set(k);
        mA[j - 1] = k;
      }
      long k = ((mS + n - 1) / n) * n;
      while (true) {
        while (mUsed.isSet(k)) {
          k += n;
        }
        if ((sum + k) % (n + 1) == 0) {
          mUsed.set(k);
          mA[mA.length - 1] = k;
          break;
        }
        k += n;
      }
      while (mUsed.isSet(mS)) {
        ++mS;
      }
    }
    return Z.valueOf(mA[mM]);
  }
}
