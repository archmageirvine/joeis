package irvine.oeis.a119;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A119258 Triangle read by rows: T(n,0) = T(n,n) = 1 and for 0&lt;k&lt;n: T(n,k) = 2*T(n-1, k-1) + T(n-1,k).
 * @author Georg Fischer
 */
public class A119258 extends Triangle {

  /** Construct the sequence. */
  public A119258() {
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 || k == n ? Z.ONE : get(n - 1, k - 1).multiply2().add(get(n - 1, k));
  }
}
