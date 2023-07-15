package irvine.oeis.a334;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A334218 Triangle read by rows: T(n,k) is the number of permutations of 1..n arranged in a circle with exactly k descents.
 * (PARI) T(n, k) = {if(n==0, k==0, n*sum(j=0, k, (-1)^j * (k-j)^(n-1) * binomial(n, j)))}
 * @author Georg Fischer
 */
public class A334218 extends Triangle {

  /** Construct the sequence. */
  public A334218() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    if (k == 0) {
      return n == 1 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= k; ++j) {
      sum = sum.add(Binomial.binomial(n, j).multiply(((j & 1) == 0) ? 1 : -1).multiply(Z.valueOf(k - j).pow(n - 1)));
    }
    return sum.multiply(n);
  }
}
