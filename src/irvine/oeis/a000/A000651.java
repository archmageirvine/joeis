package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A000651 Running time of Takeuchi function.
 * @author Sean A. Irvine
 */
public class A000651 extends MemorySequence {


  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    } else {
      Z sum = Z.ZERO;
      for (int k = 1; k <= n; ++k) {
        sum = sum.add(Functions.FACTORIAL.z(2 * k).divide(Functions.FACTORIAL.z(k)).divide(Functions.FACTORIAL.z(k + 1)));
      }
      for (int k = 0; k <= n - 2; ++k) {
        sum = sum.add(Binomial.binomial(n + k - 1, k).multiply2().subtract(Binomial.binomial(n + k, k)).multiply(a(n - 1 - k)));
      }
      return sum;
    }
  }
}
