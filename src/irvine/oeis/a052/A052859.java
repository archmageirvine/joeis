package irvine.oeis.a052;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A052859 A simple grammar.
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
      sum = sum.add(get(n - j).multiply(Binomial.binomial(n - 1, j - 1)).multiply(Stirling.secondKind(j, 2)));
    }
    return sum.multiply2();
  }
}
