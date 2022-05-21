package irvine.oeis.a102;
// manually trecpas

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A102625 Triangle read by rows: T(n,k) is the sum of the weights of all vertices labeled k at depth n in the Catalan tree (1 &lt;= k &lt;= n+1, n &gt;= 0).
 * @author Georg Fischer
 */
public class A102625 extends Triangle {

  /** Construct the sequence. */
  public A102625() {
    hasRAM(true);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : MemoryFactorial.SINGLETON.factorial(2 * n - k).multiply(k + 1)
      .divide(Z.ONE.shiftLeft(n - k).multiply(MemoryFactorial.SINGLETON.factorial(n - k)));
  }
}
