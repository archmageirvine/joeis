package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a102.A102715;

/**
 * A064450 Sum of totients of binomial coefficients C(n,j), j=0..n.
 * @author Sean A. Irvine
 */
public class A064450 extends A102715 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
