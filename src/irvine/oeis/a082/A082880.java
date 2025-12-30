package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a075.A075860;

/**
 * A082880 Largest value of A075860(j) when j runs through composite numbers between n-th and (n+1)-th primes. That is, the largest fixed-point[=prime] reached by iteration of A008472(=sum of prime factors) initiated with composite values between two consecutive primes.
 * @author Sean A. Irvine
 */
public class A082880 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mA = new A075860().skip(2);
  private long mP = 2;
  private long mM = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z max = Z.ZERO;
    while (mM < mP) {
      ++mM;
      final Z t = mA.next();
      if (!mPrime.isPrime(mM)) {
        max = max.max(t);
      }
    }
    return max;
  }
}
