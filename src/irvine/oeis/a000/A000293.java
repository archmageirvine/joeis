package irvine.oeis.a000;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a002.A002836;

/**
 * A000293.
 * @author Sean A. Irvine
 */
public class A000293 extends A002836 {

  private int mN = 0;

  @Override
  public Z next() {
    super.next();
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(IntegerPartition.partitions(k).multiply(mD[mN - k - 1]));
    }
    return sum;
  }
}
