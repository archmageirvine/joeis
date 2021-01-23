package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A030034 a(n+1) = Sum_{k=0..floor(n/4)} a(k) * a(n-k).
 * @author Sean A. Irvine
 */
public class A030034 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 4) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= (n - 1) / 4; ++k) {
      sum = sum.add(get(k).multiply(get(n - 1 - k)));
    }
    return sum;
  }
}
