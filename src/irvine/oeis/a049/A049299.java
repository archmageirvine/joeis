package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A049299 a(n) = Product_{k = 0..n-1} (a(k) + a(n-1-k)), with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A049299 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z prod = Z.ONE;
    for (int k = 0; k < n; ++k) {
      prod = prod.multiply(a(k).add(a(n - 1 - k)));
    }
    return prod;
  }
}
