package irvine.oeis.a394;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a393.A393798;
import irvine.util.array.LongDynamicLongArray;

/**
 * A394657 Number of decompositions of 2n into an unordered sum of two terms of A393798.
 * @author Sean A. Irvine
 */
public class A394657 extends Sequence1 {

  private long mN = 0;
  private final Sequence mA = new A393798();
  private final LongDynamicLongArray mB = new LongDynamicLongArray();
  private final HashSet<Long> mS = new HashSet<>();

  private long a(final long k) {
    if (k >= mB.length()) {
      final long v = mA.next().longValueExact();
      mB.set(mB.length(), v);
      mS.add(v);
    }
    return mB.get(k);
  }

  @Override
  public Z next() {
    mN += 2;
    long cnt = 0;
    for (long k = 0; 2 * a(k) <= mN; ++k) {
      final long t = mN - a(k);
      while (t > mB.get(mB.length() - 1)) {
        a(mB.length()); // force compute more terms of A393798
      }
      if (mS.contains(t)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
