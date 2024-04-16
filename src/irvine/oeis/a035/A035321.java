package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035321 Sum of composite divisors of n that are not primes nor prime powers.
 * @author Sean A. Irvine
 */
public class A035321 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (Functions.OMEGA.i(d) > 1) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}

