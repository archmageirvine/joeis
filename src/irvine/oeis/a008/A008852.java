package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008852.
 * @author Sean A. Irvine
 */
public class A008852 implements Sequence {

  private static final long[] ADD = {0, 1, 25, 76};
  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 4).multiply(100).add(ADD[(int) mN & 3]);
  }
}
