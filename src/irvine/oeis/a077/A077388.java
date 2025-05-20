package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a122.A122820;

/**
 * A077388 Row sums of the triangle in A122820.
 * @author Sean A. Irvine
 */
public class A077388 extends A122820 {

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
