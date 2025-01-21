package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074397 Number of primes between sigma(n) and n exclusive.
 * @author Sean A. Irvine
 */
public class A074397 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final Z sigma = Functions.SIGMA1.z(++mN);
    long cnt = 0;
    for (Z k = mPrime.nextPrime(Z.valueOf(mN)); k.compareTo(sigma) < 0; k = mPrime.nextPrime(k)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
