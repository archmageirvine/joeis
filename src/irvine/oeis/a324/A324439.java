package irvine.oeis.a324;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A324439 a(n) = Product_{i=1..n, j=1..n} (i^6 + j^6).
 * @author Georg Fischer
 */
public class A324439 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int i = 1; i <= mN; ++i) {
      for (int j = 1; j <= mN; ++j) {
        prod = prod.multiply(Z.valueOf(i).pow(6).add(Z.valueOf(j).pow(6)));
      }
    }
    return prod;
  }
}
