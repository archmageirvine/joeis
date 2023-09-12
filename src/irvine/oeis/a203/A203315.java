package irvine.oeis.a203;
// manually prodsi2 at 2021-11-24

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A203315 Vandermonde determinant of the first n odd primes.
 * @author Georg Fischer
 */
public class A203315 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 2; j < k; ++j) {
        final long diff = Puma.prime(k) - Puma.prime(j);
        prod = prod.multiply(diff);
      }
    }
    return prod;
  }
}
