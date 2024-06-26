package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037032 Total number of prime parts in all partitions of n.
 * @author Sean A. Irvine
 */
public class A037032 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Functions.PARTITIONS.z(mN - k).multiply(Functions.OMEGA.i(k)));
    }
    return sum;
  }
}

