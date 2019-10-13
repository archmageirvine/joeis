package irvine.oeis.a026;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026800.
 * @author Sean A. Irvine
 */
public class A026800 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return IntegerPartition.partitions(mN - 7)
      .subtract(IntegerPartition.partitions(mN - 8))
      .subtract(IntegerPartition.partitions(mN - 9))
      .add(IntegerPartition.partitions(mN - 12))
      .add(IntegerPartition.partitions(mN - 14).multiply2())
      .subtract(IntegerPartition.partitions(mN - 16))
      .subtract(IntegerPartition.partitions(mN - 17))
      .subtract(IntegerPartition.partitions(mN - 18))
      .subtract(IntegerPartition.partitions(mN - 19))
      .add(IntegerPartition.partitions(mN - 21).multiply2())
      .add(IntegerPartition.partitions(mN - 23))
      .subtract(IntegerPartition.partitions(mN - 26))
      .subtract(IntegerPartition.partitions(mN - 27))
      .add(IntegerPartition.partitions(mN - 28));
  }
}
