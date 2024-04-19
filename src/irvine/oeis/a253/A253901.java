package irvine.oeis.a253;
// manually prodsim/prodsid at 2021-11-28 14:44

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A253901 a(n) = Product_{d divides n} ((d-1)!)^moebius(n/d).
 * @author Georg Fischer
 */
public class A253901 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int mu = Functions.MOBIUS.i((long) (mN / d));
      if (mu == -1) {
        prod = prod.divide(Functions.FACTORIAL.z(d - 1));
      } else if (mu == 1) {
        prod = prod.multiply(Functions.FACTORIAL.z(d - 1));
      } // else mu == 0: multiply by 1
    }
    return prod.num();
  }
}
