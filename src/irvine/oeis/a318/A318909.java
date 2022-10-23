package irvine.oeis.a318;
// manually prodsim/prodsi at 2021-11-28 11:09

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A318909 a(n) = Product_{1&lt;=x&lt;=n, n|(x^2-1)} x.
 * @author Georg Fischer
 */
public class A318909 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      if ((k * k - 1) % mN == 0) {
        prod = prod.multiply(Z.valueOf(k));
      }
    }
    return prod;
  }
}
