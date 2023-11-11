package irvine.oeis.a066;

import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058360 Number of partitions of n whose reciprocal sum is an integer.
 * @author Sean A. Irvine
 */
public class A066824 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z total = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    while ((p = part.next()) != null) {
      Q sum = Q.ZERO;
      for (final int v : p) {
        sum = sum.add(new Q(1, v));
      }
      if (sum.isInteger()) {
        total = total.add(sum.toZ());
      }
    }
    return total;
  }
}
