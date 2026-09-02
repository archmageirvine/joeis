package irvine.oeis.a348;

import irvine.math.z.Z;
import irvine.oeis.a307.A307730;
import irvine.util.array.LongDynamicLongArray;

/**
 * A307720
 * @author Sean A. Irvine
 */
public class A348245 extends A307730 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();

  @Override
  public Z next() {
    return Z.valueOf(mCounts.increment(super.next().longValueExact()));
  }
}
