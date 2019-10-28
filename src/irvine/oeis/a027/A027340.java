package irvine.oeis.a027;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027340 Number of partitions of n that do not contain 6 as a part.
 * @author Sean A. Irvine
 */
public class A027340 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return IntegerPartition.partitions(++mN).subtract(IntegerPartition.partitions(mN - 6));
  }
}
