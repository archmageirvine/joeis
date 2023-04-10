package irvine.oeis.a062;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A062752 Row sums of unsigned N(4) staircase array A062751.
 * @author Sean A. Irvine
 */
public class A062752 extends A062751 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, 3 * ++mN, k -> mB.get(mN, k).abs());
  }
}

