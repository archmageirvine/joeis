package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005980;

/**
 * A002835 Solid partitions of n which are restricted to two planes.
 * @author Sean A. Irvine
 */
public class A002835 extends A005980 {

  private int mN = 0;

  @Override
  public Z next() {
    super.next();
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(Functions.PARTITIONS.z(k).multiply(mD[mN - k - 1]));
    }
    return sum;
  }
}
