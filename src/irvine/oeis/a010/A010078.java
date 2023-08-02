package irvine.oeis.a010;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010078 Shortest representation of -n in 2's-complement format.
 * @author Sean A. Irvine
 */
public class A010078 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Z.valueOf((1L << (LongUtils.lg(mN - 1) + 2)) - mN);
  }
}

