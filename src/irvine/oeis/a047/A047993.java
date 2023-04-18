package irvine.oeis.a047;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047993 Number of balanced partitions of n: the largest part equals the number of parts.
 * @author Sean A. Irvine
 */
public class A047993 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    int k = 0;
    while (true) {
      ++k;
      final int u = mN - (3 * k * k - k) / 2;
      if (u < 0) {
        break;
      }
      final int t = mN - (3 * k * k + k) / 2;
      sum = sum.signedAdd((k & 1) == 0, IntegerPartition.partitions(u).subtract(IntegerPartition.partitions(t)));
    }
    return sum.abs();
  }
}
