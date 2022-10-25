package irvine.oeis.a032;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032032 Number of ways to partition n labeled elements into sets of sizes of at least 2 and order the sets.
 * @author Sean A. Irvine
 */
public class A032032 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 2; k <= n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(a(n - k)));
    }
    return sum;
  }
}
