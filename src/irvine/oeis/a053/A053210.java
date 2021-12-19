package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a051.A051599;

/**
 * A053210 Row sums of A051599.
 * @author Sean A. Irvine
 */
public class A053210 extends A051599 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
