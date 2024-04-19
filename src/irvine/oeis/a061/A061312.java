package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A061312 Triangle T[n,m]: T[n,-1] = 0; T[0,0] = 0; T[n,0] = n*n!; T[n,m] = T[n,m-1] - T[n-1,m-1].
 * @author Georg Fischer
 */
public class A061312 extends Triangle {

  /** Construct the sequence. */
  public A061312() {
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ZERO : (k == 0 ? Functions.FACTORIAL.z(n).multiply(n)
      : get(n, k - 1).subtract(get(n - 1, k - 1)));
  }
}
