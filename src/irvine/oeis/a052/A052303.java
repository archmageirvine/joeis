package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052303 Number of asymmetric Greg trees.
 * @author Sean A. Irvine
 */
public class A052303 extends A052301 {

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
      sum = sum.subtract(get(j).multiply(get(mN - j)));
    }
    return sum;
  }
}
