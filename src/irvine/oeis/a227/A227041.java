package irvine.oeis.a227;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A227041 Triangle of numerators of harmonic mean of n and m, 1 &lt;= m &lt;= n.
 * a(n,m) = 2*n*m/gcd(n+m, 2*n*m)
 * @author Georg Fischer
 */
public class A227041 extends Triangle {

  /** Construct the sequence. */
  public A227041() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(int n, int m) {
    ++n;
    ++m;
    return n == 1 ? Z.ONE : new Q(2L * m * n, Functions.GCD.l(n + m, 2L * n * m)).num();
  }
}
