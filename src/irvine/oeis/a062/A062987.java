package irvine.oeis.a062;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A062987 Row sums of unsigned N(5) staircase array A062986.
 * @author Sean A. Irvine
 */
public class A062987 extends A062986 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, 4 * ++mN, k -> mB.get(mN, k).abs());
  }
}

