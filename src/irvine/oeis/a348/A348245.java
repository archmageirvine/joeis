package irvine.oeis.a348;

import irvine.math.z.Z;
import irvine.oeis.a307.A307730;
import irvine.util.array.LongDynamicLongArray;

/**
 * A348245 If A307730(n) = i, then a(n) = 1 + number of copies of i that have already appeared in A307730.
 * @author Sean A. Irvine
 */
public class A348245 extends A307730 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();

  @Override
  public Z next() {
    return Z.valueOf(mCounts.increment(super.next().longValueExact()));
  }
}
