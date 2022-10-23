package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008852 Numbers n such that n^2 and n have same last 2 digits.
 * @author Sean A. Irvine
 */
public class A008852 extends Sequence1 {

  private static final long[] ADD = {0, 1, 25, 76};
  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 4).multiply(100).add(ADD[(int) mN & 3]);
  }
}
