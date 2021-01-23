package irvine.oeis.a035;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035399 Limit of the position of the n-th partition without repetition in the list of all integer partitions sorted in reverse lexicographic order.
 * @author Sean A. Irvine
 */
public class A035399 implements Sequence {

  private static final int N = 1000000;

  private final IntegerPartition mPartition = new IntegerPartition(N);
  private long mN = 0;

  private boolean isNonRepeat(final int[] p) {
    for (int k = p.length - 1; k > 0; --k) {
      if (p[k] == p[k - 1]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final int[] p = mPartition.next();
      if (p == null) {
        throw new UnsupportedOperationException();
      }
      if (isNonRepeat(p)) {
        return Z.valueOf(mN);
      }
    }
  }
}

