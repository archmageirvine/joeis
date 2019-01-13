package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008853.
 * @author Sean A. Irvine
 */
public class A008853 implements Sequence {

  private static final long[] ADD = {0, 1, 376, 625};
  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 4).multiply(1000).add(ADD[(int) mN & 3]);
  }
}
