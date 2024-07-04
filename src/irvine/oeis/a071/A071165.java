package irvine.oeis.a071;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A071165 Row (or column) sums of A071164.
 * @author Sean A. Irvine
 */
public class A071165 extends A071164 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN * (mN + 1) / 2, k -> mB.get(mN, k));
  }
}
