package irvine.oeis.a056;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056974 Number of blocks of {0, 0, 0} in the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A056974 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long m = ++mN | (mN >>> 1) | (mN >>> 2);
    return m == 0 ? Z.ZERO : Z.valueOf(1 + LongUtils.lg(m) - Long.bitCount(m));
  }
}
