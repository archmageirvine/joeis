package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A027837 Number of subgroups of index n in free group of rank 3.
 * @author Sean A. Irvine
 */
public class A027837 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z f = Z.ONE;
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      f = f.multiply(k * (long) k);
      sum = sum.add(f.multiply(a(n - k)));
    }
    return f.multiply(n).multiply(n).multiply(n).subtract(sum);
  }
}
