package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065970 a(n) = n^2 * Sum_{primes p dividing n} (1 - 1/p^2).
 * @author Sean A. Irvine
 */
public class A065970 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    final FactorSequence fs = Jaguar.factor(mN);
    Z sum = n2.multiply(fs.omega());
    for (final Z p : fs.toZArray()) {
      sum = sum.subtract(n2.divide(p.square()));
    }
    return sum;
  }
}
