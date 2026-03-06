package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084032 Row sums of triangle A084029.
 * @author Sean A. Irvine
 */
public class A084032 extends A084029 {

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

