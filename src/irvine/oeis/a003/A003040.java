package irvine.oeis.a003;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003040 Highest degree of an irreducible representation of symmetric group <code>S_n</code> of degree <code>n</code>.
 * @author Sean A. Irvine
 */
public class A003040 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  private Z degree(final int n, final int[] a) {
    final int k = a.length;
    Z d = mF.factorial(n);
    for (int i = 0; i < k; ++i) {
      final int b = a[i] + k - i - 1;
      for (int j = i + 1; j < k; ++j) {
        d = d.multiply(b - a[j] - k + j + 1);
      }
    }
    for (int i = 0; i < k; ++i) {
      d = d.divide(mF.factorial(a[i] + k - i - 1));
    }
    return d;
  }

  @Override
  public Z next() {
    final IntegerPartition partition = new IntegerPartition(++mN);
    int[] p;
    Z max = Z.ZERO;
    while ((p = partition.next()) != null) {
      max = max.max(degree(mN, p));
    }
    return max;
  }
}
