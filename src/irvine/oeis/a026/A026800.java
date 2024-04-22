package irvine.oeis.a026;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026800 Number of partitions of n in which the least part is 7.
 * @author Sean A. Irvine
 */
public class A026800 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.PARTITIONS.z(mN - 7)
      .subtract(Functions.PARTITIONS.z(mN - 8))
      .subtract(Functions.PARTITIONS.z(mN - 9))
      .add(Functions.PARTITIONS.z(mN - 12))
      .add(Functions.PARTITIONS.z(mN - 14).multiply2())
      .subtract(Functions.PARTITIONS.z(mN - 16))
      .subtract(Functions.PARTITIONS.z(mN - 17))
      .subtract(Functions.PARTITIONS.z(mN - 18))
      .subtract(Functions.PARTITIONS.z(mN - 19))
      .add(Functions.PARTITIONS.z(mN - 21).multiply2())
      .add(Functions.PARTITIONS.z(mN - 23))
      .subtract(Functions.PARTITIONS.z(mN - 26))
      .subtract(Functions.PARTITIONS.z(mN - 27))
      .add(Functions.PARTITIONS.z(mN - 28));
  }
}
