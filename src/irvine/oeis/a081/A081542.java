package irvine.oeis.a081;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A081542 Row sums of A081541.
 * @author Sean A. Irvine
 */
public class A081542 extends A081541 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> super.next());
  }
}
