package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A050291 Number of double-free subsets of {1, 2, ..., n}.
 * @author Sean A. Irvine
 */
public class A050291 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    final int k = Long.numberOfTrailingZeros(n);
    return a(n - 1).multiply(Functions.FIBONACCI.z((long) (k + 3))).divide(Functions.FIBONACCI.z((long) (k + 2)));
  }
}
