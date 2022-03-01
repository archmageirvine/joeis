package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055136 Triangle: a(n,k) = A055135(n,k)/C(n,k).
 * n, k &gt; 1: a(n, k) = (-1)^(n+k)*(n-1)*(k-1)^(n-k-1).
 * @author Georg Fischer
 */
public class A055136 extends Triangle {

  /** Construct the sequence. */
  public A055136() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    if (k == n) {
      return Z.ONE;
    }
    if (n <= 1) {
      return Z.valueOf(k);
    }
    return Z.valueOf(n - 1).multiply(Z.valueOf(k - 1).pow(n - k - 1)).multiply((((n + k) & 1) == 0) ? 1 : -1);
  }
}
