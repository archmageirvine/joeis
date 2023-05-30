package irvine.oeis.a182;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A182491 T(n,k), a triangular array read by rows, is the Wiener index for the complete bipartite graph K(n,k).
 * @author Georg Fischer
 */
public class A182491 extends BaseTriangle {

  /** Construct the sequence. */
  public A182491() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  // T(n,k) = n*k + n*(n-1) + k*(k-1).
  public Z triangleElement(final int n, final int k) {
    return Z.valueOf(n * k).add(n * (n - 1)).add(k * (k - 1));
  }
}
