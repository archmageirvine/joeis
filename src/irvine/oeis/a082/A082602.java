package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082602 Number of primes between successive Fibonacci numbers (including possibly the Fibonacci numbers themselves).
 * @author Sean A. Irvine
 */
public class A082602 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (Z p = mPrime.nextPrime(Functions.FIBONACCI.z(++mN).subtract(1)); p.compareTo(Functions.FIBONACCI.z(mN + 1)) <= 0; p = mPrime.nextPrime(p)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
