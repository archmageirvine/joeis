package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008856 Numbers n such that <code>n^3</code> and n have same last 2 digits.
 * @author Sean A. Irvine
 */
public class A008856 implements Sequence {

  private static final long[] ADD = {0, 1, 24, 25, 49, 51, 75, 76, 99};
  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 9).multiply(100).add(ADD[(int) mN % 9]);
  }
}
