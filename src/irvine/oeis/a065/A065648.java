package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A065640.
 * @author Sean A. Irvine
 */
public class A065648 extends A007376 {

  private final long[] mCounts = new long[10];

  @Override
  public Z next() {
    return Z.valueOf(++mCounts[super.next().intValue()]);
  }
}
