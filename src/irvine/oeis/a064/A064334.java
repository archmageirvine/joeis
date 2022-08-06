package irvine.oeis.a064;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A064334 Triangle composed of generalized Catalan numbers.
 * T(n, m) = Sum_{k=0..n-m-1} (n-m-k)*binomial(n-m-1+k, k)*(-m)^k/(n-m), with T(n, 0) = T(n,n)=1.
 * @author Georg Fischer
 */
public class A064334 extends BaseTriangle {

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return n == k || k == 0 ? Z.ONE : Integers.SINGLETON.sum(0, n - k - 1,
      j -> Binomial.binomial(n - k - 1 + j, j).multiply(n - k - j).multiply(Z.valueOf(-k).pow(j)).divide(n - k));
  }
}
