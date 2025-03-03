package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A075626 a(1) = 1, then group the natural numbers so that the n-th group contains n numbers relatively prime to n whose sum is divisible by n.
 * @author Sean A. Irvine
 */
public class A075626 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long[] mA = {1};
  private int mM = -1;
  private long mS = 2;
  {
    mUsed.set(1);
  }

  @Override
  public Z next() {
    if (++mM >= mA.length) {
      mA = new long[mA.length + 1];
      final int n = mA.length;
      mM = 0;
      long k = mS;
      long sum = 0;
      for (int j = 0; j < n - 2; ++j) {
        while (mUsed.isSet(k) || Functions.GCD.l(k, n) > 1) {
          ++k;
        }
        sum += k;
        mUsed.set(k);
        mA[j] = k++;
      }
      while (mUsed.isSet(k) || Functions.GCD.l(k, n) > 1 || Functions.GCD.l(k + sum, n) > 1) {
        ++k;
      }
      mA[n - 2] = k;
      mUsed.set(k);
      sum += k;
      k += n - (k + sum) % n;
      while (mUsed.isSet(k)) {
        k += n;
      }
      mA[n - 1] = k;
      mUsed.set(k);
      while (mUsed.isSet(mS)) {
        ++mS;
      }
    }
    return Z.valueOf(mA[mM]);
  }
}
