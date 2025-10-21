package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389432 Smallest nonnegative integer with a constant congruence speed &gt;= n (see A373387 for the definition of "constant congruence speed").
 * @author Sean A. Irvine
 */
public class A389432 extends Sequence0 {

  private static final long[] SMALL = {0, 2, 5};
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[(int) mN]);
    }
    return Z.ONE.shiftLeft(mN + ((mN & 1) == 0 ? 0 : 1)).subtract(((mN * (mN + 1) / 2) & 1) == 0 ? 1 : -1);
  }
}

