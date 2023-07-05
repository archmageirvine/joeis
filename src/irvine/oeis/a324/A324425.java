package irvine.oeis.a324;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A324425 a(n) = Product_{i=1..n, j=1..n, k=1..n} (i^2 + j^2 + k^2).
 * @author Georg Fischer
 */
public class A324425 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k1 = 1; k1 <= mN; ++k1) {
      for (long k2 = 1; k2 <= mN; ++k2) {
        for (long k3 = 1; k3 <= mN; ++k3) {
          prod = prod.multiply(Z.valueOf(k1 * k1).add(k2 * k2).add(k3 * k3));
        }
      }
    }
    return prod;
  }
}
