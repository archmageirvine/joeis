package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a011.A011801;

/**
 * A028575 Row sums of triangle A011801.
 * @author Sean A. Irvine
 */
public class A028575 extends A011801 {

  private long mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
