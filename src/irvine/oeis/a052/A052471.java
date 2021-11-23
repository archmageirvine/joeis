package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A052471 Number of noncaterpillar trees on n nodes (A000055-A005418).
 * @author Sean A. Irvine
 */
public class A052471 extends A000081 {

  // After Alois P. Heinz

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 6) {
      return Z.ZERO;
    }
    Z sum = a(mN).multiply2();
    for (int k = 0; k <= mN; ++k) {
      sum = sum.subtract(a(k).multiply(a(mN - k)));
    }
    if ((mN & 1) == 0) {
      sum = sum.add(a(mN / 2));
    }
    return sum.divide2().subtract(Z.ONE.shiftLeft(mN - 4).add(Z.ONE.shiftLeft((mN - 2) / 2 - 1)));
  }
}
