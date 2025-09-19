package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008853 Numbers k such that k^2 and k have same last 3 digits.
 * @author Sean A. Irvine
 */
public class A008853 extends Sequence1 {

  private static final long[] ADD = {0, 1, 376, 625};
  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 4).multiply(1000).add(ADD[(int) mN & 3]);
  }
}
