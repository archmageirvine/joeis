package irvine.oeis.a093;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A063637.
 * @author Sean A. Irvine
 */
public class A093637 extends MemorySequence {

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(n - 1);
    int[] p;
    while ((p = part.next()) != null) {
      Z prod = Z.ONE;
      for (final int k : p) {
        prod = prod.multiply(get(k));
      }
      sum = sum.add(prod);
    }
    return sum;
  }
}
