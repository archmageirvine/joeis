package irvine.oeis.a066;

import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066824 Sum of the reciprocals of the partitions of n enumerated in A058360.
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
