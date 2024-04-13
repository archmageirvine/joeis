package irvine.oeis.a067;

import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067540 Number of partitions of n in which the sum of reciprocal of parts divides number of parts.
 * @author Sean A. Irvine
 */
public class A067540 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final IntegerPartition ip = new IntegerPartition(++mN);
    long c = 0;
    int[] p;
    while ((p = ip.next()) != null) {
      Q sum = Q.ZERO;
      for (final int v : p) {
        sum = sum.add(new Q(1L, v));
      }
      if (new Q(p.length).divide(sum).isInteger()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
