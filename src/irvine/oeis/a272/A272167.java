package irvine.oeis.a272;
// manually prodsim/prodsi at 2021-11-18 21:59

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A272167 a(n) = Product_{k=2..n} (k^2-k)^k.
 * @author Georg Fischer
 */
public class A272167 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      prod = prod.multiply(Z.valueOf(k * k - k).pow(k));
    }
    return prod;
  }
}
