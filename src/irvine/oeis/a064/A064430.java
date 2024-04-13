package irvine.oeis.a064;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a007.A007870;

/**
 * A064430 Product of the sizes of the conjugacy classes of the symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A064430 extends A007870 {

  private int mN = 0;
  private Z mF = Z.ONE;
  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.pow(IntegerPartition.partitions(mN)).divide(super.next().square());
  }
}
