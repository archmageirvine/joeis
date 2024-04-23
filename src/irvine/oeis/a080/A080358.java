package irvine.oeis.a080;
// manually prodsi2 at 2021-11-25

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080358 Value of Vandermonde determinant for the first n prime numbers: V[prime(1), ..., prime(n)].
 * @author Georg Fischer
 */
public class A080358 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(Functions.PRIME.l(k) - Functions.PRIME.l(j));
      }
    }
    return prod;
  }
}
