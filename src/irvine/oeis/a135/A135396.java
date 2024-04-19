package irvine.oeis.a135;
// manually prodsim/prodsid at 2021-11-28 12:12

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A135396 a(n) = Product_{d|n} (n-d)!.
 * @author Georg Fischer
 */
public class A135396 extends Sequence1 {

  private int mN = 0;
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      prod = prod.multiply(Functions.FACTORIAL.z(mN - d));
    }
    return prod;
  }
}
