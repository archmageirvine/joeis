package irvine.oeis.a003;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A003319 Number of connected permutations of [1..n] (those not fixing [1..j] for 0 &lt; j &lt; n). Also called indecomposable permutations, or irreducible permutations.
 * @author Sean A. Irvine
 */
public class A003319 extends MemorySequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  protected Z computeNext() {
    final int n = size() - 1;
    if (n <= 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int j = 1; j < n; ++j) {
      s = s.add(get(j + 1).multiply(mF.factorial(n - j)));
    }
    return mF.factorial(n).multiply(n).subtract(s);
  }
}

