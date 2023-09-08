package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A065640.
 * @author Sean A. Irvine
 */
public class A065649 extends A007376 {

  private final long[] mCounts = new long[10];

  @Override
  public Z next() {
    final int v = super.next().intValue();
    return Z.valueOf(10L * mCounts[v]++).add(v);
  }
}
