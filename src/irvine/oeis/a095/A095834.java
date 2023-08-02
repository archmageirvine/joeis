package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A095834 Triangle read by rows: T(n,k) = (n-k)*n, n&gt;=1, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A095834 extends Triangle {

  /** Construct the sequence. */
  public A095834() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf((long) (n - k) * (n + 1));
  }
}
