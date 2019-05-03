package irvine.oeis.a001;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A001970 Functional determinants; partitions of partitions; Euler transform applied twice to all <code>1</code>'s sequence.
 * @author Sean A. Irvine
 */
public class A001970 extends MemorySequence {

  private int mN = -1;

  private Z b(final int k) {
    Z s = Z.ZERO;
    for (int d = 1; d <= k; ++d) {
      if (k % d == 0) {
        s = s.add(IntegerPartition.partitions(d).multiply(d));
      }
    }
    return s;
  }

  @Override
  protected Z computeNext() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      s = s.add(get(mN - k).multiply(b(k)));
    }
    return s.divide(mN);
  }
}
