package irvine.oeis.a324;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A324441 a(n) = Product_{k1=1..n, k2=1..n, k3=1..n, k4=1..n} (k1 + k2 + k3 + k4).
 * @author Georg Fischer
 */
public class A324441 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k1 = 1; k1 <= mN; ++k1) {
      for (int k2 = 1; k2 <= mN; ++k2) {
        for (int k3 = 1; k3 <= mN; ++k3) {
          for (int k4 = 1; k4 <= mN; ++k4) {
            prod = prod.multiply(k1 + k2 + k3 + k4);
          }
        }
      }
    }
    return prod;
  }
}
