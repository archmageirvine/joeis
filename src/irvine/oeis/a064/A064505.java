package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064505 Interchange primes and their squares.
 * @author Sean A. Irvine
 */
public class A064505 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.valueOf(mN * mN);
    } else {
      final long s = LongUtils.sqrt(mN);
      if (s * s == mN && mPrime.isPrime(s)) {
        return Z.valueOf(s);
      } else {
        return Z.valueOf(mN);
      }
    }
  }
}
