package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A076077 Group the natural numbers so that the n-th group contains n numbers, the k-th number in a group is a multiple of k and the sum of the group is prime: (2), (1, 4), (3, 8, 6), (5, 10, 12, 16), (7, 14, 9, 24, 25), ...
 * @author Sean A. Irvine
 */
public class A076077 extends Sequence1 {

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
      for (int j = 1; j < n - 1; ++j) {
        long k = ((mS + j - 1) / j) * j;
        while (mUsed.isSet(k)) {
          k += j;
        }
        sum += k;
        mUsed.set(k);
        mA[j - 1] = k;
      }

      // Second to last element
      long k = ((mS + n - 2) / (n - 1)) * (n - 1);
      while (mUsed.isSet(k) || Functions.GCD.l(sum + k, n) != 1) {
        k += n - 1;
      }
      sum += k;
      mUsed.set(k);
      mA[n - 2] = k;

      // Last element
      k = ((mS + n - 1) / n) * n;
      while (true) {
        while (mUsed.isSet(k)) {
          k += n;
        }
        if (Predicates.PRIME.is(sum + k)) {
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
