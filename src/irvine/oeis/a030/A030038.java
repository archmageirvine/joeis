package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A030038 a(n+1) = Sum_{k=0..floor(3*n/5)} a(k) * a(n-k).
 * @author Sean A. Irvine
 */
public class A030038 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= 3 * (n - 1) / 5; ++k) {
      sum = sum.add(a(k).multiply(a(n - 1 - k)));
    }
    return sum;
  }
}
