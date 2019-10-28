package irvine.oeis.a027;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027342 Number of partitions of n that do not contain 8 as a part.
 * @author Sean A. Irvine
 */
public class A027342 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return IntegerPartition.partitions(++mN).subtract(IntegerPartition.partitions(mN - 8));
  }
}
