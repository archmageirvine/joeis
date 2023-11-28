package irvine.oeis.a051;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A051120 Start with 1; at n-th step, write down what is in the sequence so far.
 * @author Sean A. Irvine
 */
public class A051120 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private final ArrayList<Long> mA = new ArrayList<>();
  private int mM = 0;

  @Override
  public Z next() {
    if (mCounts.get(1) == 0) {
      mCounts.set(1, 1L);
      mA.add(1L);
    } else if (++mM >= mA.size()) {
      mA.clear();
      for (long k = mCounts.length() - 1; k >= 0; --k) {
        if (mCounts.get(k) > 0) {
          mA.add(mCounts.get(k));
          mA.add(k);
        }
      }
      for (final long t : mA) {
        mCounts.increment(t);
      }
      mM = 0;
    }
    return Z.valueOf(mA.get(mM));
  }
}
