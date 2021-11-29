package irvine.oeis.a250;
// manually prodsim/prodsid at 2021-11-28 15:07

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A250269 Primitive part of n! (for n&gt;=1): n! = Product_{d|n} a(d).
 * @author Georg Fischer
 */
public class A250269 implements Sequence {

  private int mN = 0;
  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int mu = Mobius.mobius(mN / d);
      if (mu == -1) {
        prod = prod.divide(FACTORIAL.factorial(d));
      } else if (mu == 1) {
        prod = prod.multiply(FACTORIAL.factorial(d));
      } // else mu == 0: multiply by 1
    }
    return prod.num();
  }
}
