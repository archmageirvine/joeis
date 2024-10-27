package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A069898 Smallest of the largest prime divisors of all the composite numbers between prime(n) and prime(n+1).
 * @author Sean A. Irvine
 */
public class A069898 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long q = mPrime.nextPrime(mP);
    long res = mP;
    for (long k = mP + 1; k < q; ++k) {
      res = Math.min(res, Functions.GPF.l(k));
    }
    return Z.valueOf(res);
  }
}
