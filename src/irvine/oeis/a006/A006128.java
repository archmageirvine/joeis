package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006128 Total number of parts in all partitions of n. Also, sum of largest parts of all partitions of n.
 * @author Sean A. Irvine
 */
public class A006128 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(IntegerPartition.partitions(mN - k).multiply(Jaguar.factor(k).sigma0()));
    }
    return sum;
  }
}
