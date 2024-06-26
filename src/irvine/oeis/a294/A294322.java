package irvine.oeis.a294;
// Generated by gen_seq4.pl prodsim/prodsif at 2021-11-18 23:07

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A294322 a(n) = Product_{k=0..n} (4*k + 3)!.
 * @author Georg Fischer
 */
public class A294322 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(4 * k + 3));
    }
    return prod;
  }
}
