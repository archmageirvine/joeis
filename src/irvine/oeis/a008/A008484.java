package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008484 Number of partitions of n into parts &gt;= 4.
 * @author Sean A. Irvine
 */
public class A008484 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.PARTITIONS.z(mN)
      .subtract(Functions.PARTITIONS.z(mN - 1))
      .subtract(Functions.PARTITIONS.z(mN - 2))
      .add(Functions.PARTITIONS.z(mN - 4))
      .add(Functions.PARTITIONS.z(mN - 5))
      .subtract(Functions.PARTITIONS.z(mN - 6));
  }
}
