package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A054687 a(n+1) = 1 + Sum_{k=0..n} binomial(n,k)*a(k)*a(n-k) for n &gt;= 0 with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A054687 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = Z.ONE;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n - 1, k).multiply(a(k)).multiply(a(n - 1 - k)));
    }
    return sum;
  }
}
