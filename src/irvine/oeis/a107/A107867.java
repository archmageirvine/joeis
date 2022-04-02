package irvine.oeis.a107;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A107867 Triangle, read by rows, where T(n,k) = C(n*(n-1)/2-k*(k-1)/2+n-k+1,n-k).
 * @author Georg Fischer
 */
public class A107867 extends Triangle {

  /** Construct the sequence. */
  public A107867() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Binomial.binomial(n * (n - 1) / 2 - k * (k - 1) / 2 + n - k + 1, n - k);
  }
}
