package irvine.oeis.a060;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;

/**
 * A060643 Number of conjugacy classes in the symmetric group S_n that have even number of elements.
 * @author Sean A. Irvine
 */
public class A060643 extends A060632 {

  private int mN = 0;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return IntegerPartition.partitions(++mN).subtract(super.next());
  }
}
