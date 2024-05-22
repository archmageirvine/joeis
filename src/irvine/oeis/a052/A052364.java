package irvine.oeis.a052;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A052364 Size of range of occurrences of digits in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A052364 extends A000796 {

  private final long[] mCnts = new long[10];

  @Override
  public Z next() {
    ++mCnts[super.next().intValue()];
    return Z.valueOf(Functions.MAX.l(mCnts) - LongUtils.min(mCnts));
  }
}
