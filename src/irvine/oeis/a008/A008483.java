package irvine.oeis.a008;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008483.
 * @author Sean A. Irvine
 */
public class A008483 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return IntegerPartition.partitions(mN)
      .subtract(IntegerPartition.partitions(mN - 1))
      .subtract(IntegerPartition.partitions(mN - 2))
      .add(IntegerPartition.partitions(mN - 3));
  }
}
