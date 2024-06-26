package irvine.oeis.a334;
// Generated by gen_seq4.pl prodsim/prodsid at 2021-11-28 23:01

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A334491 a(n) = Product_{d|n} gcd(d, sigma(d)).
 * @author Georg Fischer
 */
public class A334491 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      prod = prod.multiply(Functions.SIGMA1.z(dd).gcd(dd));
    }
    return prod;
  }
}
