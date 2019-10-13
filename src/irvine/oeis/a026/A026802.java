package irvine.oeis.a026;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026802.
 * @author Sean A. Irvine
 */
public class A026802 implements Sequence {

  private int mN = -9;

  @Override
  public Z next() {
    ++mN;
    return IntegerPartition.partitions(mN)
      .subtract(IntegerPartition.partitions(mN - 1))
      .subtract(IntegerPartition.partitions(mN - 2))
      .add(IntegerPartition.partitions(mN - 5))
      .add(IntegerPartition.partitions(mN - 7))
      .add(IntegerPartition.partitions(mN - 9))
      .subtract(IntegerPartition.partitions(mN - 11))
      .subtract(IntegerPartition.partitions(mN - 12).multiply2())
      .subtract(IntegerPartition.partitions(mN - 13))
      .subtract(IntegerPartition.partitions(mN - 15))
      .add(IntegerPartition.partitions(mN - 16))
      .add(IntegerPartition.partitions(mN - 17))
      .add(IntegerPartition.partitions(mN - 18).multiply2())
      .add(IntegerPartition.partitions(mN - 19))
      .add(IntegerPartition.partitions(mN - 20))
      .subtract(IntegerPartition.partitions(mN - 21))
      .subtract(IntegerPartition.partitions(mN - 23))
      .subtract(IntegerPartition.partitions(mN - 24).multiply2())
      .subtract(IntegerPartition.partitions(mN - 25))
      .add(IntegerPartition.partitions(mN - 27))
      .add(IntegerPartition.partitions(mN - 29))
      .add(IntegerPartition.partitions(mN - 31))
      .subtract(IntegerPartition.partitions(mN - 34))
      .subtract(IntegerPartition.partitions(mN - 35))
      .add(IntegerPartition.partitions(mN - 36))
      ;
  }
}

