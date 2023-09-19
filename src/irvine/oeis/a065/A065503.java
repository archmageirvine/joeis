package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a060.A060213;

/**
 * A065503 Indices k of primes p(k) such that p(k) is in A060213.
 * @author Sean A. Irvine
 */
public class A065503 extends A060213 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mP = Z.ONE;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z q = super.next();
    while (!mP.equals(q)) {
      ++mN;
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mN);
  }
}
