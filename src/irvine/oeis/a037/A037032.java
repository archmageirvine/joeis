package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.partition.IntegerPartition;
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
      sum = sum.add(IntegerPartition.partitions(mN - k).multiply(Jaguar.factor(k).omega()));
    }
    return sum;
  }
}

