package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076700 Number of prime powers of prime numbers less than 10^n.
 * @author Sean A. Irvine
 */
public class A076700 extends Sequence1 {

  // After Chai Wah Wu

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    final Z t = Z.TEN.pow(++mN);
    final long lim = Functions.DIGIT_LENGTH.l(2, t);
    Z count = Z.ZERO;
    for (long p = 2; p < lim; p = mPrime.nextPrime(p)) {
      count = count.add(Functions.PRIME_PI.z(t.root((int) p)));
    }
    return count;
  }
}
