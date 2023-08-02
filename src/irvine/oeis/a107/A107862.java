package irvine.oeis.a107;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A107862 Triangle, read by rows, where T(n,k) = C(n*(n-1)/2 - k*(k-1)/2 + n-k, n-k).
 * @author Georg Fischer
 */
public class A107862 extends Triangle {

  /** Construct the sequence. */
  public A107862() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Binomial.binomial((long) n * (n - 1) / 2 - (long) k * (k - 1) / 2 + n - k, n - k);
  }
}
