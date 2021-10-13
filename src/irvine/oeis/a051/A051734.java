package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A051734 a(n) = Sum_{i=0..n-1} (-1)^i * min(i+1,n-i) * a(i), a(0)=1.
 * @author Sean A. Irvine
 */
public class A051734 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.signedAdd((k & 1) == 0, get(k).multiply(Math.min(k + 1, n - k)));
    }
    return sum;
  }
}
