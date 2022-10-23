package irvine.oeis.a026;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026845 Sum_{mu a partition of n} (f^mu/n!)^{-2} where f^mu is the number of standard Young tableaux of shape mu.
 * @author Sean A. Irvine
 */
public class A026845 extends Sequence1 {

  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN).multiply(mN);
    Z sum = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(mN);
    int[] p;
    while ((p = part.next()) != null) {
      sum = sum.add(mF.divide(IntegerPartition.numStandardYoungTableaux(p).square()));
    }
    return sum;
  }
}
