package irvine.oeis.a004;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004055 <code>((p-1)/2)! mod</code> p for odd primes p.
 * @author Sean A. Irvine
 */
public class A004055 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long q = (mP - 1) / 2;
    long f = 1;
    for (long k = 2; k <= q; ++k) {
      f *= k;
      f %= mP;
    }
    return Z.valueOf(f);
  }
}
