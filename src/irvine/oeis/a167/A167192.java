package irvine.oeis.a167;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A167192 Triangle read by rows: T(n,k) = (n-k)/gcd(n,k), 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A167192 extends Triangle {

  /** Construct the sequence. */
  public A167192() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n - k).divide(Functions.GCD.l(n + 1, k + 1));
  }
}
