package irvine.oeis.a027;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027337 Number of partitions of n that do not contain 3 as a part.
 * @author Sean A. Irvine
 */
public class A027337 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return IntegerPartition.partitions(++mN).subtract(IntegerPartition.partitions(mN - 3));
  }
}
