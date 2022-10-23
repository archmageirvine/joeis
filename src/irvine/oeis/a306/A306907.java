package irvine.oeis.a306;
// manually prodsim/prodsi2 at 2021-11-28 10:55

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A306907 a(n) = Product_{i=0..n, j=0..n, k=0..n} (i*j*k + 1).
 * @author Georg Fischer
 */
public class A306907 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int i = 0; i <= mN; ++i) {
      for (int j = 0; j <= mN; ++j) {
        for (int k = 0; k <= mN; ++k) {
          prod = prod.multiply(Z.valueOf(i).multiply(j * k).add(1));
        }
      }
    }
    return prod;
  }
}
