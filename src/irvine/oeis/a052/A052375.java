package irvine.oeis.a052;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A052375 Number of occurrences of least frequent digit in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A052375 extends A000796 {

  private final long[] mCnts = new long[10];

  @Override
  public Z next() {
    ++mCnts[super.next().intValue()];
    return Z.valueOf(LongUtils.min(mCnts));
  }
}
