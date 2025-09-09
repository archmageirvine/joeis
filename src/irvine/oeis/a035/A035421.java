package irvine.oeis.a035;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035421 Limit of the position of the n-th partition such that the adjacent parts differ by at least 2 and such that the smallest part is at least 2 in the list of all integer partitions sorted in reverse lexicographic order.
 * @author Sean A. Irvine
 */
public class A035421 extends Sequence1 {

  private long mM = 0;
  private final IntegerPartition mPart = new IntegerPartition(10000000);

  private boolean is(final int[] p) {
    if (p[p.length - 1] < 2) {
      return false;
    }
    for (int k = 1; k < p.length; ++k) {
      if (p[k - 1] - p[k] < 2) {
        return false;
      }
    }
    return true;
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

