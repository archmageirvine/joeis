package irvine.oeis.a253;
// manually prodsim/prodsid at 2021-11-28 14:44

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A253901 a(n) = Product_{d divides n} ((d-1)!)^moebius(n/d).
 * @author Georg Fischer
 */
public class A253901 implements Sequence {

  private int mN = 0;
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int mu = Mobius.mobius(mN / d);
      if (mu == -1) {
        prod = prod.divide(FACTORIAL.factorial(d - 1));
      } else if (mu == 1) {
        prod = prod.multiply(FACTORIAL.factorial(d - 1));
      } // else mu == 0: multiply by 1
    }
    return prod.num();
  }
}
