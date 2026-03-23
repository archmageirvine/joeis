package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084288 Antidiagonal sums of table A084287, in which the k-th row is the product of the k-th prime with the antidiagonals of the first k rows of the table.
 * @author Sean A. Irvine
 */
public class A084288 extends A084287 {

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

