package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A074332 Direction from n-th perfect power to closest prime (-1 if down, 1 if up, 0 if two primes are closest).
 * @author Sean A. Irvine
 */
public class A074332 extends A001597 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z n = super.next();
    if (Z.ONE.equals(n)) {
      return Z.NEG_ONE;
    }
    final long p = n.subtract(mPrime.prevPrime(n)).longValue();
    final long q = mPrime.nextPrime(n).subtract(n).longValue();
    return Z.valueOf(Long.signum(q - p));
  }
}
