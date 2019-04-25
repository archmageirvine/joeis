package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a061.A061150;

/**
 * A007441 <code>1 + Sum_{n=1.</code>.inf} a_n <code>x^n = Product_{n=1.</code>.inf} (1-x^n)^prime(n).
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
      sum = sum.add(get(n - k).multiply(seq.next()));
    }
    return sum.divide(n).negate();
  }
}
