package irvine.oeis.a055;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055302 Triangle of number of labeled rooted trees with n nodes and k leaves, n &gt;= 1, 1 &lt;= k &lt;= n.
 * T(n,k) = (n!/k!)*Stirling2(n-1, n-k).
 * @author Georg Fischer
 */
public class A055302 extends Triangle {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A055302() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return FACTORIAL.factorial(n + 1).divide(FACTORIAL.factorial(k + 1)).multiply(Stirling.secondKind(n, n - k));
  }
}
