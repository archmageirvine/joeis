package irvine.oeis.a283;
// manually prodsim/prodsi at 2021-11-28 11:12

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A283361 a(n) = Product_{k=2..floor(2*n/3} (k^2 (mod 2n-1)).
 * @author Georg Fischer
 */
public class A283361 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    final int lim = (mN + mN) / 3;
    for (int k = 2; k <= lim; ++k) {
      prod = prod.multiply(k);
    }
    return prod.modPow(Z.TWO, Z.valueOf(2 * mN - 1));
  }
}
