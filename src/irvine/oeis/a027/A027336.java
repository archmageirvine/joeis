package irvine.oeis.a027;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027336 Number of partitions of n that do not contain 2 as a part.
 * @author Sean A. Irvine
 */
public class A027336 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return IntegerPartition.partitions(++mN).subtract(IntegerPartition.partitions(mN - 2));
  }
}
