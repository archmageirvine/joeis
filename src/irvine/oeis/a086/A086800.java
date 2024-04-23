package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A086800 Triangle read by rows in which row n lists differences between prime(n) and prime(k) for 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A086800 extends Triangle {

  /** Construct the sequence. */
  public A086800() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == k ? Z.ZERO : Functions.PRIME.z(n + 1).subtract(Functions.PRIME.l(k + 1));
  }
}
