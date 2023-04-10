package irvine.oeis.a062;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A062747 Row sums of (unsigned) staircase array A062746.
 * @author Sean A. Irvine
 */
public class A062747 extends A062746 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, 2 * ++mN, k -> mB.get(mN, k).abs());
  }
}

