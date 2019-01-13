package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007773.
 * @author Sean A. Irvine
 */
public class A007773 implements Sequence {

  private static final long[] SMALL = {0, 1, 1, 1, 3, 8, 21};
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[(int) mN]);
    }
    return Z.valueOf(mN).square().subtract(16).multiply(mN).add((mN & 1) == 0 ? 30 : 27).divide(6);
  }
}
