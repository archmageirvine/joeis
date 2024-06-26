package irvine.oeis.a224;
// Generated by gen_seq4.pl prodsim/prodsif at 2021-11-18 23:07

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A224986 a(n) = Product_{k=1..n-4} (n-k-2)!^(k*k!).
 * @author Georg Fischer
 */
public class A224986 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN - 4; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(mN - k - 2).pow(Z.valueOf(k).multiply(Functions.FACTORIAL.z(k))));
    }
    return prod;
  }
}
