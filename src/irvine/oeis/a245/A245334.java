package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A245334 A factorial-like triangle read by rows: T(0,0) = 1; T(n+1,0) = T(n,0)+1; T(n+1,k+1) = T(n,0)*T(n,k), k=0..n.
 * @author Georg Fischer
 */
public class A245334 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    } else if (k == 0) {
      return get(n - 1, 0).add(1);
    } else {
      return get(n - 1, 0).multiply(get(n - 1, k - 1));
    }
  }
}
