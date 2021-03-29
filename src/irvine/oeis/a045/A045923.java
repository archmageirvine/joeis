package irvine.oeis.a045;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a272.A272090;

/**
 * A045923 Number of irreducible representations of symmetric group S_n for which every matrix has determinant 1.
 * @author Sean A. Irvine
 */
public class A045923 extends A272090 {

  private int mN = 0;

  @Override
  public Z next() {
    return IntegerPartition.partitions(++mN).subtract(super.next());
  }
}
