package irvine.oeis.a098;
// manually prodsim/prodsid at 2021-11-28 12:12

import irvine.factor.factor.Cheetah;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A098710 a(n) = Product_{k|n} k!.
 * @author Georg Fischer
 */
public class A098710 implements Sequence {

  private int mN = 0;
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      prod = prod.multiply(FACTORIAL.factorial(d));
    }
    return prod;
  }
}
