package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A002067 <code>a(n) =</code> Sum_{k=0..n-1} binomial(2*n,2*k)*a(k)*a(n-k-1).
 * @author Sean A. Irvine
 */
public class A002067 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      s = s.add(Binomial.binomial(2 * n, 2 * k).multiply(get(k)).multiply(get(n - k - 1)));
    }
    return s;
  }
}
