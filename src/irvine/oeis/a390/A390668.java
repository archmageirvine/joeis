package irvine.oeis.a390;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A390668 Row sums of A390434.
 * @author Sean A. Irvine
 */
public class A390668 extends A390434 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> mB.get(mN, k));
  }
}
