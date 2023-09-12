package irvine.oeis.a080;
// manually prodsi2 at 2021-11-25

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080358 Value of Vandermonde determinant for the first n prime numbers: V[prime(1), ..., prime(n)].
 * @author Georg Fischer
 */
public class A080358 extends Sequence1 {

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(Puma.prime(k) - Puma.prime(j));
      }
    }
    return prod;
  }
}
