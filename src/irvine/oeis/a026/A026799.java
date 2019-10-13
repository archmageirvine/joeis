package irvine.oeis.a026;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026799.
 * @author Sean A. Irvine
 */
public class A026799 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return IntegerPartition.partitions(mN - 6)
      .subtract(IntegerPartition.partitions(mN - 7))
      .subtract(IntegerPartition.partitions(mN - 8))
      .add(IntegerPartition.partitions(mN - 11))
      .add(IntegerPartition.partitions(mN - 12))
      .add(IntegerPartition.partitions(mN - 13))
      .subtract(IntegerPartition.partitions(mN - 14))
      .subtract(IntegerPartition.partitions(mN - 15))
      .subtract(IntegerPartition.partitions(mN - 16))
      .add(IntegerPartition.partitions(mN - 19))
      .add(IntegerPartition.partitions(mN - 20))
      .subtract(IntegerPartition.partitions(mN - 21));
  }
}
