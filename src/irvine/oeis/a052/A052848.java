package irvine.oeis.a052;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A052848.
 * @author Sean A. Irvine
 */
public class A052848 extends MemorySequence {

  // After Alois P. Heinz

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 2; j <= n; ++j) {
      sum = sum.add(get(n - j).multiply(Binomial.binomial(n, j)).multiply(j));
    }
    return sum;
  }
}
