package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A143037 Triangle read by rows, A000012 * A127773 * A000012. A000012 is an infinite lower triangular matrix with all 1's, A127773 = (1; 0,3; 0,0,6; 0,0,0,10; ...).
 * @author Georg Fischer
 */
public class A143037 extends BaseTriangle {

  /** Construct the sequence. */
  public A143037() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // T(n,k) = k*(k^2-3*k*n-3*k+3*n^2+6*n+2) / 6.
    return Z.valueOf(k).multiply(k * k - 3 * k * n - 3 * k + 3 * n * n + 6 * n + 2).divide(6);
  }
}
