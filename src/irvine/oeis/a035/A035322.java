package irvine.oeis.a035;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035322 Sum of composite divisors of n that are less than n and are not primes nor prime powers.
 * @author Sean A. Irvine
 */
public class A035322 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (d.longValue() != mN && Cheetah.factor(d).omega() > 1) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}

