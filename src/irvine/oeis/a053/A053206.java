package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053206 Row sums of A053203.
 * @author Sean A. Irvine
 */
public class A053206 extends A053203 {

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
