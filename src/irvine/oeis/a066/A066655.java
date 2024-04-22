package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066655 Number of partitions of n*(n-1)/2.
 * @author Sean A. Irvine
 */
public class A066655 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int index = mN * ++mN / 2;
    return Functions.PARTITIONS.z(index);
  }
}
