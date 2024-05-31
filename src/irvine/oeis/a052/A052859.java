package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A052859 Expansion of e.g.f.: exp(exp(2*x) - 2*exp(x) + 1).
 * @author Sean A. Irvine
 */
public class A052859 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; ++j) {
      sum = sum.add(a(n - j).multiply(Binomial.binomial(n - 1, j - 1)).multiply(Functions.STIRLING2.z(j, 2)));
    }
    return sum.multiply2();
  }
}
