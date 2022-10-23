package irvine.oeis.a058;

import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058360 Number of partitions of n whose reciprocal sum is an integer.
 * @author Sean A. Irvine
 */
public class A058360 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    long count = 0;
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    while ((p = part.next()) != null) {
      Q sum = Q.ZERO;
      for (final int v : p) {
        sum = sum.add(new Q(1, v));
      }
      if (sum.isInteger()) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
