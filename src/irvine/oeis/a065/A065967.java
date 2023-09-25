package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065967 a(n) = n * Sum_{primes p dividing n} (1 + 1/p).
 * @author Sean A. Irvine
 */
public class A065967 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z sum = Z.valueOf(mN * fs.omega());
    for (final Z p : fs.toZArray()) {
      sum = sum.add(mN / p.longValue());
    }
    return sum;
  }
}
