package irvine.oeis.a067;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.partitions.IntegerPartition;

/**
 * A067540.
 * @author Sean A. Irvine
 */
public class A067540 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final IntegerPartition ip = new IntegerPartition(++mN);
    long c = 0;
    int[] p;
    while ((p = ip.next()) != null) {
      Q sum = Q.ZERO;
      for (final int v : p) {
        sum = sum.add(new Q(1L, (long) v));
      }
      if (new Q(p.length).divide(sum).isInteger()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
