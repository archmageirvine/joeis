package irvine.oeis.a195;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A195916 Table with T(n,n) = n, T(n,k) = xor(T(n-1,k-1), T(n-1,k)).
 * @author Georg Fischer
 */
public class A195916 extends Triangle {

  /** Construct the sequence. */
  public A195916() {
    setOffset(1);
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.ONE : (k == n ? Z.valueOf(n + 1) : get(n - 1, k - 1).xor(get(n - 1, k)));
  }
}
