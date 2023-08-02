package irvine.oeis.a221;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A221215 T(n,k)= ((n+k)^2-2*(n+k)+4-(n+3*k-2)*(-1)^(n+k))/2; n , k &gt; 0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A221215 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A221215() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n + k).square().add(-2L * (n + k) + 4).subtract(Z.valueOf(n + 3L * k - 2).multiply((((n + k) & 1) == 0) ? 1 : -1)).divide2();
  }
}
