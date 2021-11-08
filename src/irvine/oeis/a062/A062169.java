package irvine.oeis.a062;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A062169 Triangle T(n, k) = k! mod n for n &gt;= 1, 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A062169 extends Triangle {

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();  

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ZERO : FACTORIAL.factorial(k + 1).mod(Z.valueOf(n + 1));
  }
}
