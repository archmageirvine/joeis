package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A079073 Sum of numbers &lt; n having in binary representation the same number of 1's as n.
 * @author Sean A. Irvine
 */
public class A079073 extends Sequence0 {

  private final DynamicLongArray mSums = new DynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    final int ones = Long.bitCount(++mN);
    final long cnt = mSums.add(ones, mN);
    return Z.valueOf(cnt - mN);
  }
}

