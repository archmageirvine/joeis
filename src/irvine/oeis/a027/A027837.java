package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A027837.
 * @author Sean A. Irvine
 */
public class A027837 extends MemorySequence {

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z f = Z.ONE;
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      f = f.multiply(k * (long) k);
      sum = sum.add(f.multiply(get(n - k)));
    }
    return f.multiply(n).multiply(n).multiply(n).subtract(sum);
  }
}
