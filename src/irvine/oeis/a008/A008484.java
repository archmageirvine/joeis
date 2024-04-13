package irvine.oeis.a008;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008484 Number of partitions of n into parts &gt;= 4.
 * @author Sean A. Irvine
 */
public class A008484 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return IntegerPartition.partitions(mN)
      .subtract(IntegerPartition.partitions(mN - 1))
      .subtract(IntegerPartition.partitions(mN - 2))
      .add(IntegerPartition.partitions(mN - 4))
      .add(IntegerPartition.partitions(mN - 5))
      .subtract(IntegerPartition.partitions(mN - 6));
  }
}
