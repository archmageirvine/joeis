package irvine.oeis.a147;
// Generated by gen_seq4.pl prodsim/prodsi at 2021-11-18 23:07

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A147630 a(1) = 1; for n&gt;1, a(n) = Product_{k = 1..n-1} (9k - 3).
 * @author Georg Fischer
 */
public class A147630 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN - 1; ++k) {
      prod = prod.multiply(Z.valueOf(9L * k - 3));
    }
    return prod;
  }
}
