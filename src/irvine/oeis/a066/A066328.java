package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066328 a(n) = sum of indices of distinct prime factors of n; here, index(i-th prime) = i.
 * @author Sean A. Irvine
 */
public class A066328 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      sum = sum.add(Functions.PRIME_PI.l(p));
    }
    return sum;
  }
}
