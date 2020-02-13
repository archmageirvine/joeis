package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a013.A013988;

/**
 * A028844.
 * @author Sean A. Irvine
 */
public class A028844 extends A013988 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
