package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A085383 Triangle read by rows, 1 &lt;= k &lt;= n: T(n,k) = floor(n/k)*ceiling(n/k).
 * @author Georg Fischer
 */
public class A085383 extends Triangle {

  /** Construct the sequence. */
  public A085383() {
    hasRAM(true);
  }

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return n == 1 ? Z.ONE : new Q(n, k).ceiling().multiply(n / k);
  }
}
