package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058220 Ultra-useful primes: smallest k such that 2^(2^n) - k is prime.
 * @author Sean A. Irvine
 */
public class A058220 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(1 << ++mN);
    return t.subtract(mPrime.prevPrime(t));
  }
}

