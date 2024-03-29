package irvine.oeis.a324;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A324438 a(n) = Product_{i=1..n, j=1..n} (i^5 + j^5).
 * @author Georg Fischer
 */
public class A324438 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int i = 1; i <= mN; ++i) {
      for (int j = 1; j <= mN; ++j) {
        prod = prod.multiply(Z.valueOf(i).pow(5).add(Z.valueOf(j).pow(5)));
      }
    }
    return prod;
  }
}
