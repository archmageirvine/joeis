package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A079510 Triangle T(n,k) read by rows; related to number of preorders.
 * T[n_, k_]:= ... If[n==1 &amp;&amp; k==1, 1, n*(T[n-1, k-1] + T[n-2, k-1])]];
 * @author Georg Fischer
 */
public class A079510 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    } else if (k == 0) {
      return Z.ZERO;
    }
    return get(n - 1, k - 1).add(get(n - 2, k - 1)).multiply(n + 1);
  }
}
