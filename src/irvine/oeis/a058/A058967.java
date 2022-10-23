package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A058967 If n &lt; 8 then A058966(n), else n*2^(n - 3) - 2*n - 50.
 * @author Sean A. Irvine
 */
public class A058967 extends Sequence3 {

  private static final long[] SMALL = {1, 2, 10, 30, 78};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[mN]);
    }
    return Z.valueOf(mN + 3).shiftLeft(mN).subtract(2L * (mN + 3) + 50);
  }
}
