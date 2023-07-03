package irvine.oeis.a324;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A324427 a(n) = Product_{k=1..n} (Product_{j=1..k} (Product_{i=1..j} (i+j+k))).
 * @author Georg Fischer
 */
public class A324427 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod1 = Z.ONE;
    for (int k1 = 1; k1 <= mN; ++k1) {
      Z prod2 = Z.ONE;
      for (int k2 = 1; k2 <= k1; ++k2) {
        Z prod3 = Z.ONE;
        for (int k3 = 1; k3 <= k2; ++k3) {
          prod3 = prod3.multiply(k1 + k2 + k3);
        }
        prod2 = prod2.multiply(prod3);
      }
      prod1 = prod1.multiply(prod2);
    }
    return prod1;
  }
}
