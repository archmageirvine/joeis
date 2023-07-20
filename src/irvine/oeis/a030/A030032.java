package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A030032 a(n+1) = Sum_{k=0..floor(n/3)} a(k) * a(n-k).
 * @author Sean A. Irvine
 */
public class A030032 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= (n - 1) / 3; ++k) {
      sum = sum.add(a(k).multiply(a(n - 1 - k)));
    }
    return sum;
  }
}
