package irvine.oeis.a067;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A067302 Row sums of triangle A067298 and of A067304.
 * @author Sean A. Irvine
 */
public class A067302 extends A067298 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
