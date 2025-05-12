package irvine.oeis.a381;

import java.util.HashSet;
import java.util.Set;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383357.
 * @author Sean A. Irvine
 */
public class A381811 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Set<Long> sums = new HashSet<>();
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    while ((p = part.next()) != null) {
      long v = 0;
      for (final int u : p) {
        v += (long) u * u;
      }
      sums.add(v);
    }
    long k = mN;
    while (sums.contains(k)) {
      k += 2;
    }
    return Z.valueOf((k - 2 - mN) / 2);
  }
}

