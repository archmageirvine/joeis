package irvine.oeis.a291;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A291909 Triangle read by rows: T(n,k) is the coefficient of x^(2*k) in the cycle polynomial of the complete bipartite graph K_{n,n}, 1 &lt;= k &lt;= n.
 * @author Gregory Morse
 */
public class A291909 extends Triangle {
  /** Construct the sequence. */
  public A291909() {
    setOffset(1);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return k == 0 ? Z.ZERO : Binomial.binomial(n + 1, k + 1).square().multiply(Functions.FACTORIAL.z(k + 1)).multiply(Functions.FACTORIAL.z(k)).divide2();
  }
}
