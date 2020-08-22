package irvine.oeis.a185;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A185325 Number of partitions of n into parts &gt;= 5.
 * @author Sean A. Irvine
 */
public class A185325 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return IntegerPartition.partitions(mN)
      .subtract(IntegerPartition.partitions(mN - 1))
      .subtract(IntegerPartition.partitions(mN - 2))
      .add(IntegerPartition.partitions(mN - 5).multiply2())
      .subtract(IntegerPartition.partitions(mN - 8))
      .subtract(IntegerPartition.partitions(mN - 9))
      .add(IntegerPartition.partitions(mN - 10));
  }
}
