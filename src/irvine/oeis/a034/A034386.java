package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034386 Primorial numbers (second definition): n# = product of primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A034386 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mPrimorial = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      mPrimorial = mPrimorial.multiply(mN);
    }
    return mPrimorial;
  }
}
