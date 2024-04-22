package irvine.oeis.a026;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026802 Number of partitions of n in which the least part is 9.
 * @author Sean A. Irvine
 */
public class A026802 extends Sequence1 {

  private int mN = -9;

  @Override
  public Z next() {
    ++mN;
    return Functions.PARTITIONS.z(mN)
      .subtract(Functions.PARTITIONS.z(mN - 1))
      .subtract(Functions.PARTITIONS.z(mN - 2))
      .add(Functions.PARTITIONS.z(mN - 5))
      .add(Functions.PARTITIONS.z(mN - 7))
      .add(Functions.PARTITIONS.z(mN - 9))
      .subtract(Functions.PARTITIONS.z(mN - 11))
      .subtract(Functions.PARTITIONS.z(mN - 12).multiply2())
      .subtract(Functions.PARTITIONS.z(mN - 13))
      .subtract(Functions.PARTITIONS.z(mN - 15))
      .add(Functions.PARTITIONS.z(mN - 16))
      .add(Functions.PARTITIONS.z(mN - 17))
      .add(Functions.PARTITIONS.z(mN - 18).multiply2())
      .add(Functions.PARTITIONS.z(mN - 19))
      .add(Functions.PARTITIONS.z(mN - 20))
      .subtract(Functions.PARTITIONS.z(mN - 21))
      .subtract(Functions.PARTITIONS.z(mN - 23))
      .subtract(Functions.PARTITIONS.z(mN - 24).multiply2())
      .subtract(Functions.PARTITIONS.z(mN - 25))
      .add(Functions.PARTITIONS.z(mN - 27))
      .add(Functions.PARTITIONS.z(mN - 29))
      .add(Functions.PARTITIONS.z(mN - 31))
      .subtract(Functions.PARTITIONS.z(mN - 34))
      .subtract(Functions.PARTITIONS.z(mN - 35))
      .add(Functions.PARTITIONS.z(mN - 36))
      ;
  }
}

