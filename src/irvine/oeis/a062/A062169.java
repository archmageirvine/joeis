package irvine.oeis.a062;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A062169 Triangle of n! mod k.
 * @author Georg Fischer
 */
public class A062169 extends Triangle {

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();  

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ZERO : FACTORIAL.factorial(k + 1).mod(Z.valueOf(n + 1));
  }
}
