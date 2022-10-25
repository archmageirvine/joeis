package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052302 Number of Greg trees with n black nodes.
 * @author Sean A. Irvine
 */
public class A052302 extends A052300 {

  {
    setOffset(0);
  }

  // After Alois P. Heinz

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = super.next();
    for (int j = 0; j < mN; ++j) {
      sum = sum.subtract(a(j).multiply(a(mN - j)));
    }
    return sum;
  }
}
