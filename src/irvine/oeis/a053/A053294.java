package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A053294 a(0)=1, a(m+1) = Sum_{k=0..m}[a(k)^2 * a(m-k)^2].
 * @author Sean A. Irvine
 */
public class A053294 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(get(k).square().multiply(get(n - 1 - k).square()));
    }
    return sum;
  }
}
