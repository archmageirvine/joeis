package irvine.oeis.a026;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026799 Number of partitions of n in which the least part is 6.
 * @author Sean A. Irvine
 */
public class A026799 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.PARTITIONS.z(mN - 6)
      .subtract(Functions.PARTITIONS.z(mN - 7))
      .subtract(Functions.PARTITIONS.z(mN - 8))
      .add(Functions.PARTITIONS.z(mN - 11))
      .add(Functions.PARTITIONS.z(mN - 12))
      .add(Functions.PARTITIONS.z(mN - 13))
      .subtract(Functions.PARTITIONS.z(mN - 14))
      .subtract(Functions.PARTITIONS.z(mN - 15))
      .subtract(Functions.PARTITIONS.z(mN - 16))
      .add(Functions.PARTITIONS.z(mN - 19))
      .add(Functions.PARTITIONS.z(mN - 20))
      .subtract(Functions.PARTITIONS.z(mN - 21));
  }
}
