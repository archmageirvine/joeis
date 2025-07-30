package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A079070 Number of numbers &lt; n having in binary representation the same number of 0's as n.
 * @author Sean A. Irvine
 */
public class A079070 extends Sequence1 {

  private final DynamicLongArray mCounts = new DynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    final int zeros = Functions.DIGIT_LENGTH.i(2, ++mN) - Long.bitCount(mN);
    final long cnt = mCounts.increment(zeros);
    return Z.valueOf(cnt - 1);
  }
}

