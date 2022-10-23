package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051265 Maximal value of prime divisors of numbers in reduced residue system for n.
 * @author Sean A. Irvine
 */
public class A051265 extends Sequence1 {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    ++mN;
    long s = -1;
    long k = 1;
    for (long p = 2; k <= mN; p = mPrime.nextPrime(p)) {
      if (mN % p != 0) {
        ++s;
        k *= p;
      }
    }
    return Z.valueOf(s);
  }
}

