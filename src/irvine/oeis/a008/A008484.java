package irvine.oeis.a008;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008484 Number of partitions of n into parts <code>&gt;= 4</code>.
 * @author Sean A. Irvine
 */
public class A008484 implements Sequence {

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
