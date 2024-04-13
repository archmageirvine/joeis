package irvine.oeis.a067;

import irvine.math.IntegerUtils;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067539 Number of partitions of n in which, if the number of parts is k, the product of the parts is the k-th power of some positive integer.
 * @author Sean A. Irvine
 */
public class A067539 extends Sequence1 {

  private int mN = 0;

  private boolean isGeometric(final int[] p) {
    return IntegerUtils.product(p).root(p.length).auxiliary() == 1;
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    long cnt = 0;
    while ((p = part.next()) != null) {
      if (isGeometric(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
