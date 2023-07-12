package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A095887 Triangle read by rows: T(n,k) = (n-k+1)^n, n&gt;=1, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A095887 extends Triangle {

  /** Construct the sequence. */
  public A095887() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n - k + 1).pow(n + 1);
  }
}
