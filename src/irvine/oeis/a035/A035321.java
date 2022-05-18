package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035321 Sum of composite divisors of n that are not primes nor prime powers.
 * @author Sean A. Irvine
 */
public class A035321 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (Jaguar.factor(d).omega() > 1) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}

