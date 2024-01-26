package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A068076 Number of positive integers &lt; n with the same number of 1's in their binary expansions as n.
 * @author Sean A. Irvine
 */
public class A068076 extends Sequence1 {

  private final DynamicLongArray mCounts = new DynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mCounts.increment(Long.bitCount(++mN)) - 1);
  }
}
