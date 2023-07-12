package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A143218 Triangle read by rows, A127775 * A000012 * A127775; 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A143218 extends Triangle {

  /** Construct the sequence. */
  public A143218() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(2 * n + 1).multiply(Z.valueOf(2 * k + 1));
  }
}
