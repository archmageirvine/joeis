package irvine.oeis.a277;
// Generated by gen_seq4.pl prodsim/prodsi at 2021-11-18 23:07

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A277347 a(n) = Product_{k=1..n} (2*k*(k-1)+1).
 * @author Georg Fischer
 */
public class A277347 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(Z.valueOf(2L * k * (k - 1) + 1));
    }
    return prod;
  }
}
