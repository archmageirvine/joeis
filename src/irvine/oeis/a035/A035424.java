package irvine.oeis.a035;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035424 Limit of the position of the n-th partition such that with k parts the smallest part is at least k in the list of all integer partitions sorted in reverse lexicographic order.
 * @author Sean A. Irvine
 */
public class A035424 extends Sequence1 {

  private long mM = 0;
  private final IntegerPartition mPart = new IntegerPartition(10000000);

  private boolean is(final int[] p) {
    return p[p.length - 1] >= p.length;
  }

  @Override
  public Z next() {
    while (true) {
      ++mM;
      if (is(mPart.next())) {
        return Z.valueOf(mM);
      }
    }
  }
}

