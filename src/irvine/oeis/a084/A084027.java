package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084027 Row sums in A084024.
 * @author Sean A. Irvine
 */
public class A084027 extends A084024 {

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

