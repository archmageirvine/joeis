package irvine.oeis.a050;

import irvine.math.LongUtils;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A050293 Number of 3-fold-free subsets of {1, 2, ..., n}.
 * @author Sean A. Irvine
 */
public class A050293 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    if (n == 1) {
      return Z.TWO;
    }
    final int k = LongUtils.valuation(n, 3);
    return a(n - 1).multiply(Fibonacci.fibonacci(k + 3)).divide(Fibonacci.fibonacci(k + 2));
  }
}
