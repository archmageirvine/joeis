package irvine.oeis.a026;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026801.
 * @author Sean A. Irvine
 */
public class A026801 implements Sequence {

  private int mN = -8;

  @Override
  public Z next() {
    ++mN;
    return IntegerPartition.partitions(mN)
      .subtract(IntegerPartition.partitions(mN - 1))
      .subtract(IntegerPartition.partitions(mN - 2))
      .add(IntegerPartition.partitions(mN - 5))
      .add(IntegerPartition.partitions(mN - 7))
      .add(IntegerPartition.partitions(mN - 8))
      .subtract(IntegerPartition.partitions(mN - 10))
      .subtract(IntegerPartition.partitions(mN - 11))
      .subtract(IntegerPartition.partitions(mN - 12).multiply2())
      .add(IntegerPartition.partitions(mN - 16).multiply2())
      .add(IntegerPartition.partitions(mN - 17))
      .add(IntegerPartition.partitions(mN - 18))
      .subtract(IntegerPartition.partitions(mN - 20))
      .subtract(IntegerPartition.partitions(mN - 21))
      .subtract(IntegerPartition.partitions(mN - 23))
      .add(IntegerPartition.partitions(mN - 26))
      .add(IntegerPartition.partitions(mN - 27))
      .subtract(IntegerPartition.partitions(mN - 28));
  }
}

