package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicIntArray;

/**
 * A058978.
 * @author Sean A. Irvine
 */
public class A058978 implements Sequence {

  private final DynamicLongArray mF = new DynamicLongArray();
  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mN = 0;
  private int mM = 2;
  {
    mF.set(1, 1);
  }

  private void search(final long sum, final int last, int cnt) {
    if (sum > 0) {
      final int existing = mA.get(sum);
      if (existing == 0 || cnt < existing) {
        mA.set(sum, cnt);
      }
    }
    for (int k = last - 2; k > 1; --k) {
      final long f = fibonacci(k);
      search(sum - f, k, cnt + 1);
      search(sum + f, k, cnt + 1);
    }
  }

  private long fibonacci(final int n) {
    while (n >= mF.length()) {
      final int m = mF.length();
      mF.set(m, mF.get(m - 1) + mF.get(m - 2));
    }
    return mF.get(n);
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0 || 2 * mN >= fibonacci(mM)) {
      search(fibonacci(mM), mM, 1);
      ++mM;
    }
    return Z.valueOf(mA.get(mN));
  }
}
