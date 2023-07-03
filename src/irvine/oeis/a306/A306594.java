package irvine.oeis.a306;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A306594 a(n) = Product_{i=1..n, j=1..n, k=1..n} (i + j + k).
 * @author Georg Fischer
 */
public class A306594 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k1 = 1; k1 <= mN; ++k1) {
      for (int k2 = 1; k2 <= mN; ++k2) {
        for (int k3 = 1; k3 <= mN; ++k3) {
          prod = prod.multiply(k1 + k2 + k3);
        }
      }
    }
    return prod;
  }
}
