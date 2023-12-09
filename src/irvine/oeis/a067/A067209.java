package irvine.oeis.a067;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a008.A008300;

/**
 * A067209 Number of n X n 0..1 matrices with all row and column sums equal.
 * @author Sean A. Irvine
 */
public class A067209 extends A008300 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> t(mN, k));
  }
}

