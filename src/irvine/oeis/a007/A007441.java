package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a061.A061150;
import irvine.oeis.memory.MemorySequence;

/**
 * A007441 1 + Sum_{n&gt;=1} a_n x^n = Product_{n&gt;=1} (1-x^n)^prime(n).
 * @author Sean A. Irvine
 */
public class A007441 extends MemorySequence {

  @Override
  public Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final A061150 seq = new A061150();
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(a(n - k).multiply(seq.next()));
    }
    return sum.divide(n).negate();
  }
}
