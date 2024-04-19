package irvine.oeis.a098;
// manually prodsim/prodsid at 2021-11-28 12:12

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A098710 a(n) = Product_{k|n} k!.
 * @author Georg Fischer
 */
public class A098710 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      prod = prod.multiply(Functions.FACTORIAL.z(d));
    }
    return prod;
  }
}
