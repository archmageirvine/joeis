package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A003024.
 * @author Sean A. Irvine
 */
public class A003024 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      s = s.signedAdd((k & 1) == 1, Binomial.binomial(n, k).shiftLeft(k * (n - k)).multiply(get(n - k)));
    }
    return s;
  }
}
