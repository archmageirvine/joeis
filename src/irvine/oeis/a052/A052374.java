package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A052374 Number of occurrences of most frequent digit in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A052374 extends A000796 {

  private final long[] mCnts = new long[10];
  private long mMax = 0;

  @Override
  public Z next() {
    final int d = super.next().intValue();
    if (++mCnts[d] > mMax) {
      mMax = mCnts[d];
    }
    return Z.valueOf(mMax);
  }
}
