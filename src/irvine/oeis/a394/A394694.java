package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a081.A081493;
import irvine.util.array.LongDynamicLongArray;

/**
 * A394694 Number of occurrences of n in A081493.
 * @author Sean A. Irvine
 */
public class A394694 extends Sequence1 {

  private final Sequence mA = new A081493();
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      mCounts.increment(mA.next().longValueExact());
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
