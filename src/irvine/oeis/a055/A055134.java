package irvine.oeis.a055;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055134 Triangle read by rows: T(n,k) = number of labeled endofunctions on n points with k fixed points.
 * <code>T(n, k) = C(n, k)*(n-1)^(n-k)</code>, for n&gt;1.
 * @author Georg Fischer
 */
public class A055134 extends Triangle {

  /** Construct the sequence. */
  public A055134() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    if (n <= 1) {
      return Z.valueOf(1 - (n - k));
    }
    return Binomial.binomial(n, k).multiply(Z.valueOf(n - 1).pow(n - k));
  }
}
