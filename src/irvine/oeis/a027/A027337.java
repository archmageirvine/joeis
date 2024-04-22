package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027337 Number of partitions of n that do not contain 3 as a part.
 * @author Sean A. Irvine
 */
public class A027337 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int index = ++mN;
    return Functions.PARTITIONS.z(index).subtract(Functions.PARTITIONS.z(mN - 3));
  }
}
