package irvine.oeis.a250;
// manually prodsim/prodsid at 2021-11-28 15:07

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A250269 Primitive part of n! (for n&gt;=1): n! = Product_{d|n} a(d).
 * @author Georg Fischer
 */
public class A250269 extends Sequence1 {

  private int mN = 0;
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int mu = Functions.MOBIUS.i((long) (mN / d));
      if (mu == -1) {
        prod = prod.divide(FACTORIAL.factorial(d));
      } else if (mu == 1) {
        prod = prod.multiply(FACTORIAL.factorial(d));
      } // else mu == 0: multiply by 1
    }
    return prod.num();
  }
}
